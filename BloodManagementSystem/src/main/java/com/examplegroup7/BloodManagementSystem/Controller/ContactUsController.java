package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.ContactUs;
import com.examplegroup7.BloodManagementSystem.services.ContactUsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path="/contactus" )
public class ContactUsController {

    @Autowired
    ContactUsDAO contactUsDAO;

    @PostMapping("/addMessage")
    public ContactUs addMessage(@RequestBody ContactUs message){
        return contactUsDAO.save(message);
    }
}
