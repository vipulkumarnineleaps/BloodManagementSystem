package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.FindDonorsNotification;
import com.examplegroup7.BloodManagementSystem.services.FindDonorsNotificationRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindDonorsNotificationController {

    @Autowired
    public FindDonorsNotificationRepositoryImpl response;

    @PostMapping("/sendnotification")
    public String getResponse(@RequestBody FindDonorsNotification data){ return response.getResponse();}
}
