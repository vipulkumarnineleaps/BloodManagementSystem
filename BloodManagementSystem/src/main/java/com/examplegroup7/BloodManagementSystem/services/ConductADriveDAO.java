package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.repository.ConductADriveRepository;
import org.springframework.stereotype.Service;

@Service
public class ConductADriveDAO implements ConductADriveRepository {
    public String message = "Drive Initiated Successfully, check My-Drives section for more Info.";
    @Override
    public String getMessage() {
        return message;
    }
}
