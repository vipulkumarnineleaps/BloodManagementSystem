package com.examplegroup7.BloodManagementSystem.controllers;

import com.examplegroup7.BloodManagementSystem.models.ProfileBb;
import com.examplegroup7.BloodManagementSystem.models.ProfileHos;
import com.examplegroup7.BloodManagementSystem.models.ProfileInd;
import com.examplegroup7.BloodManagementSystem.repositories.ProfileBbRepository;
import com.examplegroup7.BloodManagementSystem.repositories.ProfileHosRepository;
import com.examplegroup7.BloodManagementSystem.repositories.ProfileIndRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    ProfileIndRepository profileIndRepository;

    @Autowired
    ProfileHosRepository profileHosRepository;

    @Autowired
    ProfileBbRepository profileBbRepository;


    //? SETTING NEW DONOR STATUS.
    @PutMapping("/donorstatus")
    public ResponseEntity<String> updateDonorStatus(@RequestBody int newStatus){

        //! HERE, YOU NEED TO EXTRACT THE USER ID FROM TOKEN, SINCE TOKEN IS NOT AVAILABLE, DATA IS HARDCODED.
        String userId = "1";

        ProfileInd profileInd = profileIndRepository.findByUserId(userId);

        profileInd.setDonorStatus(newStatus);


        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("success", "true");
        return ResponseEntity.ok().headers(responseHeaders).body("ok");
    }


    //? UPDATING INDIVIDUAL PROFILE
    @PutMapping("/updateindprofile")
    public ProfileInd updateIndProfile(@RequestBody ProfileInd profile){
//      ProfileInd match = profileRepository.findByUserId(profile.getUserId());
        ProfileInd match = profile;

        //TODO ADD ALL THE GETTERS AND SETTERS IF THIS DOESN'T WORK.

        return profileIndRepository.save(match);
    }


    //? UPDATING HOSPITAL PROFILE
    @PutMapping("/updatehosprofile")
    public ProfileHos updateHosProfile(@RequestBody ProfileHos profile){
//      ProfileInd match = profileRepository.findByUserId(profile.getUserId());
        ProfileHos match = profile;

        //TODO ADD ALL THE GETTERS AND SETTERS IF THIS DOESN'T WORK.

        return profileHosRepository.save(match);
    }

    //? UPDATING BLOOD BANK PROFILE
    @PutMapping("/updatebbprofile")
    public ProfileBb updateBbProfile(@RequestBody ProfileBb profile){
//      ProfileBb match = profileRepository.findByUserId(profile.getUserId());
        ProfileBb match = profile;

        //TODO ADD ALL THE GETTERS AND SETTERS IF THIS DOESN'T WORK.

        return profileBbRepository.save(match);
    }



    //? FOR TESTING ONLY ///////////////////////////////////////////////////////////////////////////////////////////////////////////


    @PostMapping("/addnewprofile")
    public ProfileInd addNewProfile(@RequestBody ProfileInd profile){
        return profileIndRepository.save(profile);
    }


    @GetMapping("/recieveprofile")
    public List<ProfileInd> extractProfileDetails(){
        System.out.println("getting profile data now!");
        return profileIndRepository.findAll();
    }

    //!HARDCODED HERE, SET TO ACTUAL
    @GetMapping("/userprofile")
    public ProfileInd extractProfile(){
        return profileIndRepository.findByUserId("1");
    }

    //?//////////////////////////////////////////////////////////////////////////////////////////////////////////

}
