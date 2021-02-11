package com.examplegroup7.BloodManagementSystem.services;


import com.examplegroup7.BloodManagementSystem.entities.MyProfile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyProfileServiceImpl implements MyProfileService {
    public List <MyProfile> list = new ArrayList<>();
    @Override
    public List<MyProfile> getProfileDetails() {

        list.clear();
        list.add(new MyProfile("Aayush", "aayush@gmail.com", "12/11/1990", "B+",91,"Rajiv Nagar","Bihar","patna", 12));
        
        return list;
    }
}