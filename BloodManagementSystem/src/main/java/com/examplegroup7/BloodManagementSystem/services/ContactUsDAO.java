package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.entities.ContactUs;
import com.examplegroup7.BloodManagementSystem.repository.ContactUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsDAO {

    @Autowired
    ContactUsRepository contactusRepository;

    public ContactUs save( ContactUs message){ return contactusRepository.save(message); }
}
