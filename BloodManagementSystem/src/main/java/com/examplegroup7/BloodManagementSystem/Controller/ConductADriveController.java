package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.ConductADrive;
import com.examplegroup7.BloodManagementSystem.services.ConductADriveDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConductADriveController {

    @Autowired
    public ConductADriveDAO conductadrive;

    @PostMapping("/conductadrive")
    public String getMessage (@RequestBody ConductADrive data){
       return conductadrive.getMessage();
    }
}
