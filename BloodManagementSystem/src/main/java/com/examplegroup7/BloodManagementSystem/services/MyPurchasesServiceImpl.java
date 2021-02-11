package com.examplegroup7.BloodManagementSystem.services;


import com.examplegroup7.BloodManagementSystem.entities.MyPurchases;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyPurchasesServiceImpl implements MyPurchasesService {
    public List <MyPurchases> list = new ArrayList<>();
    @Override
    public List<MyPurchases> getPurchasesDetails() {

        list.clear();
        list.add(new MyPurchases("Aditya", "22/11/1998", "A+", "plasma",20,"8979492735",900.0));
        list.add(new MyPurchases("Amit", "12/11/2000", "O-", "blood",50,"8979492735",900.0));
        list.add(new MyPurchases("Percy", "22/11/1998", "A+", "plasma",20,"8979492735",900.0));

      return list;
    }
}
