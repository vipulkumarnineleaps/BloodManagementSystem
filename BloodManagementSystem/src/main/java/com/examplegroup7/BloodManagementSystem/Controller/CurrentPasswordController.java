package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.CurrentPassword;
import com.examplegroup7.BloodManagementSystem.services.CurrentPasswordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrentPasswordController {

    @Autowired
    public CurrentPasswordServiceImpl currentpassword;

    @PostMapping("/currentPassword")
    public String getMessage(@RequestBody CurrentPassword data){
        return currentpassword.getMessage();
    }

//    @PutMapping("/changepassword/{id}")
//    public String getMessage(@Requestbody ChangePassword data)
}