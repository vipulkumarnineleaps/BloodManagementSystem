package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.MyPurchases;
import com.examplegroup7.BloodManagementSystem.services.MyPurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyPurchasesController {

    @Autowired
    public MyPurchasesService mypurchases;
    @GetMapping("/purchases")
    public List<MyPurchases> getPurchasesDetails(){
        return mypurchases.getPurchasesDetails();
    }
}
