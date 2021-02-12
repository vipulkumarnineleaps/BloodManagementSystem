package com.examplegroup7.BloodManagementSystem.services;


import org.springframework.stereotype.Service;

@Service
public class CurrentPasswordServiceImpl implements CurrentPasswordService {
    public String message = "Password is correct";
    @Override
    public String getMessage() { return  message; }
}
