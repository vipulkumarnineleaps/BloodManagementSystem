package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.entities.*;
import com.examplegroup7.BloodManagementSystem.repository.ProfileBbRepository;
import com.examplegroup7.BloodManagementSystem.repository.ProfileHosRepository;
import com.examplegroup7.BloodManagementSystem.repository.ProfileIndRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

@Service
public class VerifyCurrentPasswordDAO {

    @Autowired
    ProfileBbRepository profileBbRepository;
    @Autowired
    ProfileIndRepository profileIndRepository;
    @Autowired
    ProfileHosRepository profileHosRepository;
    @Autowired
    PasswordEncoder bcryptEncoder;


    public ResponseEntity<SuccessResponseBody> saveInd(String message, String userId) {
        ProfileInd obj = profileIndRepository.findByUserId(userId);
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        if (b.matches(message, obj.getPassword())) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("success", "true");

            return ResponseEntity.ok().headers(responseHeaders).body(new SuccessResponseBody(true));
        }else {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("success", "false");

            return ResponseEntity.ok().headers(responseHeaders).body(new SuccessResponseBody(false));
        }
    }

    public ResponseEntity<SuccessResponseBody> saveBb(String message, String userId) {
        ProfileBb obj = profileBbRepository.findByUserId(userId);
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        if (b.matches(message, obj.getPassword())) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("success", "true");

            return ResponseEntity.ok().headers(responseHeaders).body(new SuccessResponseBody(true));
        }else {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("success", "false");

            return ResponseEntity.ok().headers(responseHeaders).body(new SuccessResponseBody(false));
        }
    }

    public ResponseEntity<SuccessResponseBody> saveHos(String message, String userId) {
        ProfileHos obj = profileHosRepository.findByUserId(userId);
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        if (b.matches(message, obj.getPassword())) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("success", "true");

            return ResponseEntity.ok().headers(responseHeaders).body(new SuccessResponseBody(true));
        }else {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("success", "false");

            return ResponseEntity.ok().headers(responseHeaders).body(new SuccessResponseBody(false));
        }
    }

}
