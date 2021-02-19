package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.SuccessResponseBody;
import com.examplegroup7.BloodManagementSystem.services.ChangePasswordDAO;
import com.examplegroup7.BloodManagementSystem.services.VerifyCurrentPasswordDAO;
import com.examplegroup7.BloodManagementSystem.services.ProfileDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "/profile")
public class ProfileController {

    @Autowired
    ProfileDAO profileDAO;

    @GetMapping("/userprofile")
    public Object getProfileDetails(@RequestParam String id){

        String userType = "1";

        if(userType == "1"){
            return profileDAO.getProfileDetailsInd(id);
        }else if(userType == "2"){
            return profileDAO.getProfileDetailsBb(id);
        }else{
            return profileDAO.getProfileDetailsHos(id);
        }
    }

    @GetMapping("/fetchprofiledata")
    public Object getProfileDataDetails(@RequestParam String id){
//Change userId to UserType
        String userType = "1";

        if(userType == "1"){
            return profileDAO.getProfileIndDetails(id);
        }else if(userType == "2"){
            return profileDAO.getProfileBbDetails(id);
        }else{
            return profileDAO.getProfileHosDetails(id);
        }
    }

    @Autowired
    VerifyCurrentPasswordDAO verifycurrentPasswordDAO;

    @PostMapping("/verifycurrentPassword")
    public ResponseEntity<SuccessResponseBody> verifyPass(@RequestBody String message) {

        String userId ="Aa";
        String userType = "1";

        if(userType == "1"){
            return verifycurrentPasswordDAO.saveInd(message, userId);
        }else if(userType == "2"){
            return verifycurrentPasswordDAO.saveBb(message, userId);
        }else{
            return verifycurrentPasswordDAO.saveHos(message, userId);
        }
    }

    @Autowired
    ChangePasswordDAO changePasswordDAO;

    @PutMapping("/changePassword")
    public ResponseEntity<SuccessResponseBody> changePass(@RequestBody String message) {

        String userId ="Aa";
        String userType = "1";

        if(userType == "1"){
            return changePasswordDAO.saveInd(message, userId);
        }else if(userType == "2"){
            return changePasswordDAO.saveBb(message, userId);
        }else{
            return changePasswordDAO.saveHos(message, userId);
        }
    }
}