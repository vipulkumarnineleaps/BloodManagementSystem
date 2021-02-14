package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.CurrentPassword;
import com.examplegroup7.BloodManagementSystem.services.CurrentPasswordDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/password")
public class CurrentPasswordController {

    @Autowired
    public CurrentPasswordDAO currentPasswordDAO;

    @PostMapping("/currentPassword")
    public CurrentPassword addmessage(@RequestBody CurrentPassword message) { return currentPasswordDAO.save(message);}

}