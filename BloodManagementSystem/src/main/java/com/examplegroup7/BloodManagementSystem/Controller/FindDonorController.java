package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.FindDonors;
import com.examplegroup7.BloodManagementSystem.repository.FindDonorRepository;
import com.examplegroup7.BloodManagementSystem.services.FindDonorsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path="/finddonors")
public class FindDonorController {

    @Autowired
    FindDonorsDAO findDonorsDAO;

    @PostMapping("/donorslist")
    public String getDonorsList(@RequestBody FindDonors data) { return findDonorsDAO.getDonorsList(data); }
}
