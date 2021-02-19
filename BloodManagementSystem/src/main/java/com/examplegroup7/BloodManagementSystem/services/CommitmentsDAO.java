package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.ResponseBody.MyCommitment_RespBody_donation;
import com.examplegroup7.BloodManagementSystem.models.*;
import com.examplegroup7.BloodManagementSystem.repository.DonationInvitedDonorRepo;
import com.examplegroup7.BloodManagementSystem.repository.DonationRequestRepo;
import com.examplegroup7.BloodManagementSystem.repository.DriveInvitedDonorRepo;
import com.examplegroup7.BloodManagementSystem.repository.DrivesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommitmentsDAO {

    @Autowired
    DonationInvitedDonorRepo donationInvitedDonorRepo;

    @Autowired
    DriveInvitedDonorRepo driveInvitedDonorRepo;

    @Autowired
    DrivesRepo drivesRepo;

    @Autowired
    DonationRequestRepo donationRequestRepo;


    public List<?> getDetails(String id){

        List<DonationInvitedDonor> obj = new ArrayList<>();
        List<DriveInvitedDonor> obj2 = new ArrayList<>();
        List<Object> obj3 = new ArrayList<>();
        obj = donationInvitedDonorRepo.findByUserId(id);    //accessing the 'donation_invited_donor' table
        obj2 =  driveInvitedDonorRepo.findByUserId(id);     //accessing the 'drive_invited_donor' table

        for(int i =0 ; i< obj.size(); i++){
            if(obj.get(i).getAcceptance() == 1){
                DonationRequest obj4 = donationRequestRepo.findByDonationId(obj.get(i).getDonationId());  //accessing the 'donation_request' table
                System.out.println(obj4.getBloodGroup());

                if(obj4.getStatus()){
                    //get the user contact from hos/BB table, for hospital/BB -> first number
                    // find the user type based on user Id and search the corresponding profile table accordingly to get 1st user contact
                    MyCommitment_RespBody_donation donationDetails = new MyCommitment_RespBody_donation(obj.get(i).getResponseTimeStamp(),"donation", "blood bank", obj4.getUserId(), 111111, obj4.getAddress(), true);
                    obj3.add(donationDetails);
                }

            }
        }


        for(int i =0 ; i< obj2.size(); i++){
            if(obj2.get(i).getAcceptance() == 1){
                Drives obj4 = drivesRepo.findByDriveId(obj2.get(i).getDriveId());  //accessing the 'drives' table

                if(obj4.getStatus()) {
                    MyCommitment_RespBody_donation donationDetails = new MyCommitment_RespBody_donation(obj2.get(i).getResponseTimeStamp(), "drive", "hospital", obj4.getUserId(), 222222, obj4.getAddress(), true);
                    obj3.add(donationDetails);
                }
            }
        }

        return obj3;


    }
}
