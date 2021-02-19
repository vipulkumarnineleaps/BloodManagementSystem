package com.examplegroup7.BloodManagementSystem.services;


import com.examplegroup7.BloodManagementSystem.RequestBody.ConductADrive_ReqBody;
import com.examplegroup7.BloodManagementSystem.ResponseBody.SuccessResponseBody;
import com.examplegroup7.BloodManagementSystem.models.*;
import com.examplegroup7.BloodManagementSystem.repository.DriveInvitedDonorRepo;
import com.examplegroup7.BloodManagementSystem.repository.DrivesRepo;
import com.examplegroup7.BloodManagementSystem.repository.FindDonorsRepo;
import com.examplegroup7.BloodManagementSystem.repository.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class DrivesDAO {

    @Autowired
    DrivesRepo drivesRepo;

    @Autowired
    NotificationRepo notificationRepo;

    @Autowired
    FindDonorsRepo findDonorsRepo;

    @Autowired
    DriveInvitedDonorRepo driveInvitedDonorRepo;


    public List<Individual> individuals = new ArrayList<>(); // list to store individual details
    public List<String> idList = new ArrayList<>(); //list to store ids

    public ResponseEntity<SuccessResponseBody> saveDriveDetails(ConductADrive_ReqBody data) {

        // getting the current timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        // saving the details in the 'drives' table
        Drives obj4 = new Drives(data.getUserId(),data.getStartTimeStamp(), data.getEndTimeStamp(), data.getAddress(), data.getState(), data.getDistrict(), data.getPincode(), data.getMessage(), timestamp, data.getBloodGroups().contains("B+"), data.getBloodGroups().contains("B-"),data.getBloodGroups().contains("A+"),data.getBloodGroups().contains("A-"),data.getBloodGroups().contains("O+"),data.getBloodGroups().contains("O-"),data.getBloodGroups().contains("AB+"),data.getBloodGroups().contains("AB-"));
        obj4.setStatus(true);
        Drives returnObj = drivesRepo.save(obj4);

        //saving the details in the 'notification' table
        Notification obj = new Notification(data.getStartTimeStamp(),"Drives Conducted Successfully",data.getUserId());
        obj.setStatus(false);   // setting the default status of notification -> false (not seen)
        notificationRepo.save(obj);

        // getting the details of the individuals matching the blood group criterion of 'conduct a drive' form
        individuals = findDonorsRepo.findByBloodGroupIn(data.getBloodGroups());

        // filtering the user ids of the individuals
        for (int i = 0; i < individuals.size(); i++) {
           idList.add(String.valueOf(individuals.get(i).getUserId()));
        }

        //getting the drive Id
        String driveId = returnObj.getDriveId();

        // saving the details in the 'drives_invited_donors';
        for (int i = 0; i < idList.size(); i++) {
            DriveInvitedDonor obj2 = new DriveInvitedDonor(driveId, idList.get(i),0,2,"",null,null);   // 2 -> pending, 0 -> rejected
            driveInvitedDonorRepo.save(obj2);
        }


        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("success", "true");

        return ResponseEntity.ok().headers(responseHeaders).body(new SuccessResponseBody(true));


    }
}
