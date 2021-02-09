package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.entities.MySalesDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MySalesServiceImpl implements MySalesService{
    List<MySalesDetails> list;
    public MySalesServiceImpl()
    {
        list=new ArrayList<>();
        list.add(new MySalesDetails(1001));
        list.add(new MySalesDetails(1002));
    }
    public List<MySalesDetails> getMySalesdetails()
    {
        return list;

    }
}
