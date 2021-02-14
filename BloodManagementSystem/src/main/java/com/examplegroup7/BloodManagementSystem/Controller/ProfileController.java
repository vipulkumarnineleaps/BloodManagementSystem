package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.Profile;
import com.examplegroup7.BloodManagementSystem.entities.ProfileData;
import com.examplegroup7.BloodManagementSystem.services.ProfileDAO;
import com.examplegroup7.BloodManagementSystem.services.ProfileDataDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/profile")
public class ProfileController {

    @Autowired
    ProfileDAO profileDAO;

    @GetMapping("/userprofile")
    public List<Profile> getProfileDetails(){
        return profileDAO.getProfileDetails();
    }

    @Autowired
    ProfileDataDAO profileDataDAO;

    @GetMapping("/fetchprofiledata")
    public List<ProfileData> getProfileDataDetails(){
        return profileDataDAO.getProfileDataDetails();
    }

}