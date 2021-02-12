package com.examplegroup7.BloodManagementSystem.services;


import com.examplegroup7.BloodManagementSystem.entities.Profile;
import com.examplegroup7.BloodManagementSystem.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileDAO{

    @Autowired
    ProfileRepository profileRepository;

    public List<Profile> getProfileDetails() { return profileRepository.findAll();}
}
