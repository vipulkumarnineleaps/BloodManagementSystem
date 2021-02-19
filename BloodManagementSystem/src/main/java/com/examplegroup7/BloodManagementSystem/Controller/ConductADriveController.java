package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.RequestBody.ConductADrive_ReqBody;
import com.examplegroup7.BloodManagementSystem.ResponseBody.SuccessResponseBody;
import com.examplegroup7.BloodManagementSystem.services.DrivesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/conductadrive")
public class ConductADriveController {

    @Autowired
    public DrivesDAO conductadrive;

    @PostMapping("/savedrivedetails")
    public ResponseEntity<SuccessResponseBody> saveDriveDetails (@RequestBody ConductADrive_ReqBody data){
        // get the user_id from the token and then -> data.setUserId( user_id )
        return conductadrive.saveDriveDetails(data);
    }
}
