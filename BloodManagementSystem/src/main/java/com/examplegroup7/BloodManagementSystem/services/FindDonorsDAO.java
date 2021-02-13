package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.entities.FindDonors;
import org.springframework.stereotype.Service;

@Service
public class FindDonorsDAO {

    public String message= "List of available donors";
    public String getDonorsList(FindDonors data){ return message; }
}
