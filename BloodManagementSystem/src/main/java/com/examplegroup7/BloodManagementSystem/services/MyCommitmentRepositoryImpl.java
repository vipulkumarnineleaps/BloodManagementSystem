package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.entities.MyCommintmentDetails;
import com.examplegroup7.BloodManagementSystem.repository.MyCommitmentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyCommitmentRepositoryImpl implements MyCommitmentRepository {
    List<MyCommintmentDetails> list;
    public MyCommitmentRepositoryImpl()  //haven't used the database just used the list of details
    {
        list=new ArrayList<>();
        list.add(new MyCommintmentDetails("Drive", 1001L,"Gandhi Nagar"));//have to add start and end time and other details
        list.add(new MyCommintmentDetails("Donation", 1002L,"Shastri Nagar"));
    }

    public List<MyCommintmentDetails> getcommitdetails()
    {
        return list;
    }
}
