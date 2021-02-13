package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.Sales;
import com.examplegroup7.BloodManagementSystem.repository.SalesRepository;
import com.examplegroup7.BloodManagementSystem.services.PurchasesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path="/purchases" )
public class PurchasesController {

    @Autowired
    PurchasesDAO purchasesDAO;

    @GetMapping("/fetchpurchaseslist")
    public List<Sales> getSalesList(@RequestParam String id, @RequestParam String bg) {
        return purchasesDAO.getPurchasesList(id,bg);
    }
}
