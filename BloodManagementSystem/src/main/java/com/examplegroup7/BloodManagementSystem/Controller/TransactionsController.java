package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.models.Sales;
import com.examplegroup7.BloodManagementSystem.services.PurchasesDAO;
import com.examplegroup7.BloodManagementSystem.services.SalesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path="/transactions" )
public class TransactionsController {

    @Autowired
    PurchasesDAO purchasesDAO;

    @Autowired
    SalesDAO salesDAO;

    @GetMapping("/fetchpurchaseslist/{id}")
    public List<Sales> getPurchasesList(@PathVariable(value = "id") String id) {
        return purchasesDAO.getPurchasesList(id);
    }

    @GetMapping("/fetchsaleslist/{id}")
    public List<Sales> getSalesList(@PathVariable(value = "id") String id) {
        return salesDAO.getSalesList(id);
    }
}
