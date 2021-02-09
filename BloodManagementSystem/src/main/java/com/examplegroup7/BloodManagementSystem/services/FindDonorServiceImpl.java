package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.entities.DonorDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FindDonorServiceImpl implements FindDonorService{
    List<DonorDetails> list;

    public FindDonorServiceImpl() {
        list=new ArrayList<>();
        list.add(new DonorDetails("Ajay", 123456789,"ajay@gmail.com","AB+"));
        list.add(new DonorDetails("Bibhu", 123100212,"bibhu@gmail.com","A+"));
    }
    public List<DonorDetails> getdonordetails()
    {
    return list;
    }
}
