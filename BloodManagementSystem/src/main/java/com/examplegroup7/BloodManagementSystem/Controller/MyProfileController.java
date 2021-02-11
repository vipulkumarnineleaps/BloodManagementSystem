package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.MyProfile;
import com.examplegroup7.BloodManagementSystem.services.MyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyProfileController {

    @Autowired
    public MyProfileService profile;
    @GetMapping("/profile")
    public List<MyProfile> getProfileDetails(){
        return profile.getProfileDetails();
    }
}