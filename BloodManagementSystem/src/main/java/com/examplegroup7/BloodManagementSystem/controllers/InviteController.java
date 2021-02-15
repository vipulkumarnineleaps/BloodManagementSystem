package com.examplegroup7.BloodManagementSystem.controllers;

import com.examplegroup7.BloodManagementSystem.models.*;
import com.examplegroup7.BloodManagementSystem.repositories.DonationInvitedDonorsRepository;
import com.examplegroup7.BloodManagementSystem.repositories.DriveInvitedDonorsRepository;
import com.examplegroup7.BloodManagementSystem.repositories.NotificationRepository;
import com.examplegroup7.BloodManagementSystem.repositories.ProfileIndRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequestMapping("/invites")
public class InviteController {

    @Autowired
    DonationInvitedDonorsRepository donationInvitedDonorsRepository;

    @Autowired
    DriveInvitedDonorsRepository driveInvitedDonorsRepository;

    @Autowired
    ProfileIndRepository profileRepository;

    @Autowired
    NotificationRepository notificationRepository;

    @PutMapping("/inviteresponse")
    public ResponseEntity<String> setDona(@RequestBody InviteResponse inviteResponse){

        //? HERE, WE NEED TO PUT ACCEPTED INVITES AND ALSO, SET IN IN THE NOTIFICATIONS TABLE.

        if(inviteResponse.getEventType() == "drive"){
            //? MAKE A NEW ID OBJECT

            DriveInvitedDonorsId driveInvitedDonorsId = new DriveInvitedDonorsId();
            driveInvitedDonorsId.setDriveId(inviteResponse.getEventId());
            driveInvitedDonorsId.setUserId(inviteResponse.getUserId());

            DriveInvitedDonors driveInvitedDonors = driveInvitedDonorsRepository.findByDriveInvitedDonorsId(driveInvitedDonorsId);

            driveInvitedDonors.setAcceptance(inviteResponse.getAcceptance());
            driveInvitedDonors.setDonation_status(inviteResponse.isDonationStatus());
            driveInvitedDonors.setRejection_message(inviteResponse.getRejectionMessage());

            driveInvitedDonorsRepository.save(driveInvitedDonors);

        }
        else{

            DonationInvitedDonorsId donationInvitedDonorsId = new DonationInvitedDonorsId();
            donationInvitedDonorsId.setDonationId(inviteResponse.getEventId());
            donationInvitedDonorsId.setUserId(inviteResponse.getUserId());

            DonationInvitedDonors donationInvitedDonors = donationInvitedDonorsRepository.findByDonationInvitedDonorsId(donationInvitedDonorsId);

            donationInvitedDonors.setAcceptance(inviteResponse.getAcceptance());
            donationInvitedDonors.setDonation_status(inviteResponse.isDonationStatus());
            donationInvitedDonors.setRejection_message(inviteResponse.getRejectionMessage());

            donationInvitedDonorsRepository.save(donationInvitedDonors);

        }

        //? ALSO, TO SET THE NOTIFICATION, WE HAVE,

        //?1.  GET THE NAME OF THE DONOR.

        ProfileInd donorProfile = profileRepository.findByUserId(inviteResponse.getUserId());

        String donorName = donorProfile.getName();

        //?2. MAKE A NEW NOTIFICATION OBJECT FOR THE CURRENT USER AND SAVE IT IN THE NOTIFICATIONS TABLE.

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        Notification notification = new Notification();
        notification.setUserId(inviteResponse.getUserId());
        notification.setTitle("New donor!");
        notification.setMessage( donorName + "has accepted your" + inviteResponse.getEventType() + "invite.");
        notification.setNotificationDate(timestamp);

        notificationRepository.save(notification);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("success", "true");
        return ResponseEntity.ok().headers(responseHeaders).body("ok");


    }

}
