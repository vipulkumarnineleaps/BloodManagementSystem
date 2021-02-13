package com.examplegroup7.BloodManagementSystem.services;


import com.examplegroup7.BloodManagementSystem.entities.Sales;
import com.examplegroup7.BloodManagementSystem.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchasesDAO {

    @Autowired
    SalesRepository salesRepository;
    public List<Sales> getPurchasesList (String id, String bg) { return salesRepository.findByBuyerIdAndBloodGroup(id, bg); }
}
