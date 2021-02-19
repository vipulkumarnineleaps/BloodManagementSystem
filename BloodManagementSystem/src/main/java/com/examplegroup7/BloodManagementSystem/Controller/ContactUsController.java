package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.models.ContactUs;
import com.examplegroup7.BloodManagementSystem.ResponseBody.SuccessResponseBody;
import com.examplegroup7.BloodManagementSystem.services.ContactUsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( path="/contactus" )
public class ContactUsController {

    @Autowired
    ContactUsDAO contactUsDAO;

    @PostMapping("/addMessage")
    public ResponseEntity<SuccessResponseBody> addMessage(@RequestBody ContactUs message){
        return contactUsDAO.save(message);
    }

}
