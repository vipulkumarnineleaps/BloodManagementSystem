package com.examplegroup7.BloodManagementSystem.controllers;

import com.examplegroup7.BloodManagementSystem.models.DonationRequest;
import com.examplegroup7.BloodManagementSystem.repositories.DonationRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donationrequests")
public class DonationRequestsController {

    @Autowired
    DonationRequestRepository donationRequestRepository;

    @PutMapping("/expirerequest")
    public ResponseEntity<String> expireRequest(@RequestBody String donationId){

        DonationRequest donationRequest = donationRequestRepository.findByDonationId(donationId);
        donationRequest.setStatus(true);

        donationRequestRepository.save(donationRequest);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("success", "true");
        return ResponseEntity.ok().headers(responseHeaders).body("ok");
    }

    @GetMapping("/fetchrequests")
    public ResponseEntity<List<DonationRequest>> fetchDonationRequests(){
        //! HARDCODED DATA FOR NOW, USER ID TO BE EXTRACTED FROM TOKEN
        String userId = "1";

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("success", "true");
        return ResponseEntity.ok().headers(responseHeaders).body(donationRequestRepository.findByUserId(userId));
    }


}