package com.examplegroup7.BloodManagementSystem.services;


import com.examplegroup7.BloodManagementSystem.entities.CurrentPassword;
import com.examplegroup7.BloodManagementSystem.repository.CurrentPasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentPasswordDAO {

    @Autowired
    CurrentPasswordRepository currentpasswordRepository;

    public CurrentPassword save(CurrentPassword message) { return  currentpasswordRepository.save(message);}
}
