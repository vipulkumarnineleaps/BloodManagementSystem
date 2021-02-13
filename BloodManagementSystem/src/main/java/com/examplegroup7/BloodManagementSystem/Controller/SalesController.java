package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.MySalesDetails;
import com.examplegroup7.BloodManagementSystem.entities.Sales;
import com.examplegroup7.BloodManagementSystem.repository.SalesRepository;
import com.examplegroup7.BloodManagementSystem.services.SalesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path = "/sales")
public class SalesController {

    @Autowired
    SalesDAO salesDAO;


    @GetMapping("/fetchsaleslist")
    public List<Sales> getSalesList(@RequestParam String id) {
        return salesDAO.getSalesList(id);
    }
}
