package com.examplegroup7.BloodManagementSystem.services;


import com.examplegroup7.BloodManagementSystem.models.Sales;
import com.examplegroup7.BloodManagementSystem.repository.SalesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchasesDAO {

    @Autowired
    SalesRepo salesRepo;

    public List<Sales> getPurchasesList (String id) { return salesRepo.findByBuyerId(id); }
}
