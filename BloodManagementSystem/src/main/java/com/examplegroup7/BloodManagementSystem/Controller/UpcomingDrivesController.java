package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.UpcomingDrives;
import com.examplegroup7.BloodManagementSystem.services.UpcomingDrivesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/upcomingDrives")
public class UpcomingDrivesController {


    @Autowired
    UpcomingDrivesDAO upcomingDrivesDAO;

    @PostMapping("/fetchupcomingdrive")
    public UpcomingDrives addMessage(@RequestBody UpcomingDrives message){
        return upcomingDrivesDAO.save(message);
    }
}
