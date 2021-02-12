package com.examplegroup7.BloodManagementSystem.services;


import com.examplegroup7.BloodManagementSystem.entities.UpcomingDrives;
import com.examplegroup7.BloodManagementSystem.repository.UpcomingDrivesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpcomingDrivesDAO {

    @Autowired
    UpcomingDrivesRepository upcomingdrivesRepository;

    public UpcomingDrives save( UpcomingDrives message ) { return upcomingdrivesRepository.save(message);}
}
