package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.repository.FindDonorsNotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class FindDonorsNotificationRepositoryImpl implements FindDonorsNotificationRepository {
    public String response = "Invitation sent, check my-donation requests section for more info. ";
    @Override
    public String getResponse() {
        return response;
    }
}
