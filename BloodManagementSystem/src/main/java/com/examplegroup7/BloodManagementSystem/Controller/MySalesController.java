package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.MySalesDetails;
import com.examplegroup7.BloodManagementSystem.services.MySalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MySalesController {

    @Autowired
    public MySalesService mySalesService;
    @GetMapping("/mySalesDetails")
            public List<MySalesDetails> getMySalesdetails()
    {
        return this.mySalesService.getMySalesdetails();
    }
}
