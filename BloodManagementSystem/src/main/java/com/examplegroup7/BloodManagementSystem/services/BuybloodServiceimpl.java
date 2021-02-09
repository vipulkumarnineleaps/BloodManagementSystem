package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.entities.Bloodbankdetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BuybloodServiceimpl implements BuybloodService {
    List<Bloodbankdetails> list;

    public BuybloodServiceimpl()  //haven't used the database just used the list of details
    {
       list=new ArrayList<>();
       list.add(new Bloodbankdetails(1001,"ABC HOSPITAL","AAYUSH"));
       list.add(new Bloodbankdetails(1002,"DEF Blood Bank","Shastri Nagar"));
    }

    public List<Bloodbankdetails> getbuyblood()
    {
        return list;
    }

}
