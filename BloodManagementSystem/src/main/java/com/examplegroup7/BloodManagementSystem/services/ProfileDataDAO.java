package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.entities.ProfileData;
import com.examplegroup7.BloodManagementSystem.repository.ProfileDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProfileDataDAO {

    @Autowired
    ProfileDataRepository profiledataRepository;

    public List<ProfileData> getProfileDataDetails() { return profiledataRepository.findAll();}
}
