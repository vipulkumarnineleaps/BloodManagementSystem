package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.RequestBody.FindDonors_ReqBody;
import com.examplegroup7.BloodManagementSystem.RequestBody.FindDonors_ReqBody_withSelectedDonors;
import com.examplegroup7.BloodManagementSystem.ResponseBody.FindDonors_RespBody;
import com.examplegroup7.BloodManagementSystem.ResponseBody.SuccessResponseBody;
import com.examplegroup7.BloodManagementSystem.models.*;
import com.examplegroup7.BloodManagementSystem.repository.DonationInvitedDonorRepo;
import com.examplegroup7.BloodManagementSystem.repository.DonationRequestRepo;
import com.examplegroup7.BloodManagementSystem.repository.FindDonorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FindDonorsDAO {

    @Autowired
    FindDonorsRepo findDonorsRepo;

    @Autowired
    DonationRequestRepo donationRequestRepo;

    @Autowired
    DonationInvitedDonorRepo donationInvitedDonorRepo;


    public List<FindDonors_RespBody> getDonorsList(FindDonors_ReqBody data){

        List<Individual> list = new ArrayList<>();
        List<FindDonors_RespBody> result = new ArrayList<>();

        list = findDonorsRepo.findByBloodGroup(data.getBloodGroup());
        list = list.stream().filter( item -> item.getDonorStatus().equals(1)).collect(Collectors.toList());

        //change the selection criterion in the form for the front end accordingly ( either check for empty state, district fields or check for 'ALL')
        if(!(data.getState().equals("All") || data.getDistrict().equals(""))){
           list = list.stream().filter( item -> item.getState().equals(data.getState())).collect(Collectors.toList());
        }
        if(!(data.getDistrict().equals("All") || data.getDistrict().equals(""))){
            list = list.stream().filter( item -> item.getDistrict().equals(data.getDistrict())).collect(Collectors.toList());
        }
        if(data.getPincode() != null){
            list = list.stream().filter( item -> item.getPincode().equals(data.getPincode())).collect(Collectors.toList());
        }

        //this list will populate the find donors results table
        result = list.stream().map(item -> new FindDonors_RespBody(item.getUserId(), item.getName(), item.getAddress(),item.getState(), item.getDistrict(), item.getPincode() )).collect(Collectors.toList());
        return result;
    }


    public ResponseEntity<SuccessResponseBody> getResponse(FindDonors_ReqBody_withSelectedDonors data){

        //getting current timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        //saving the details of the user/recipient (who searched for donors) in the 'donation_request' table
        //get the user id from the token
        //get the blood group from the table using the user id
        DonationRequest donationRequest = new DonationRequest("1", timestamp ,data.getAddress(), data.getState(), data.getDistrict(), data.getPincode(), "A+", false);
        donationRequestRepo.save(donationRequest);

        //saving the ids of the selected donors in the 'donation_invited_donor' table
        String donationId = donationRequest.getDonationId();
        List<String> idList = data.getIdList();

        for(int i = 0; i < idList.size(); i++) {
           DonationInvitedDonor obj = new DonationInvitedDonor(String.valueOf(donationId), idList.get(i),0, 2,"",null,null);  //2-> pending , 0-> rejected
            donationInvitedDonorRepo.save(obj);
        }

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("success", "true");

        return ResponseEntity.ok().headers(responseHeaders).body(new SuccessResponseBody(true));
    }
}
