package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.DonorDetails;
import com.examplegroup7.BloodManagementSystem.services.FindDonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindDonorController {

    @Autowired
    public FindDonorService findDonorService;
        @GetMapping("/finddonor")
                public List<DonorDetails> getdonordetails()
        {
            return this.findDonorService.getdonordetails();

        }

    }
