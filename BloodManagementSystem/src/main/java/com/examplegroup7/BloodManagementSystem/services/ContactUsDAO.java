package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.models.ContactUs;
import com.examplegroup7.BloodManagementSystem.ResponseBody.SuccessResponseBody;
import com.examplegroup7.BloodManagementSystem.repository.ContactUsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ContactUsDAO {

    @Autowired
    ContactUsRepo contactusRepo;

    public ResponseEntity<SuccessResponseBody> save(ContactUs message){

        contactusRepo.save(message);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("success", "true");

        return ResponseEntity.ok().headers(responseHeaders).body(new SuccessResponseBody(true));
    }
}
