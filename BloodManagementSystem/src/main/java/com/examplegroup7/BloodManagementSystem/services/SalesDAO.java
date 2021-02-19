package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.models.Sales;
import com.examplegroup7.BloodManagementSystem.repository.SalesRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesDAO {

    @Autowired
    SalesRepo salesRepo;

    public List<Sales> getSalesList (String id) {
        return salesRepo.findBySellerId(id); }
}