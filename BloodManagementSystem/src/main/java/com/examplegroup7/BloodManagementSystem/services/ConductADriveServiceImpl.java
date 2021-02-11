package com.examplegroup7.BloodManagementSystem.services;

import org.springframework.stereotype.Service;

@Service
public class ConductADriveServiceImpl implements ConductADriveService{
    public String message = "Drive Initiated Successfully, check My-Drives section for more Info.";
    @Override
    public String getMessage() {
        return message;
    }
}
