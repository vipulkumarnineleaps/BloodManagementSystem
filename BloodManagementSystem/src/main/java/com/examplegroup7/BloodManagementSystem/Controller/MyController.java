package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.Bloodbankdetails;
import com.examplegroup7.BloodManagementSystem.services.BuybloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController
{
    @Autowired
    public BuybloodService buybloodService;
    //get the details of the blood bank
    @GetMapping("/buyblood")
    public List<Bloodbankdetails> getbuyblood()
    {
        return this.buybloodService.getbuyblood();
    }

    //This module is for the buying of the blood from blood bank
    /*@GetMapping("/buyblood/{}")
    public Bloodbankdetails getblood(@PathVariable String buy) {
      */
    }

