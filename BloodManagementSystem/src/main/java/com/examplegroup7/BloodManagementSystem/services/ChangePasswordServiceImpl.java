package com.examplegroup7.BloodManagementSystem.services;


import org.springframework.stereotype.Service;

@Service
public class ChangePasswordServiceImpl implements ChangePasswordService {
    public String message= "Password changed!";
    @Override
    public String getMessage(){ return message; }
}
