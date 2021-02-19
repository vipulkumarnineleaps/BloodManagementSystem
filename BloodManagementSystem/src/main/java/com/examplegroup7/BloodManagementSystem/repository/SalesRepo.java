package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.models.Sales;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface SalesRepo extends JpaRepository<Sales,String > {

    //function for retrieving sales list
    public List<Sales> findBySellerId(String id);

    //function for retrieving purchases list
    public List<Sales> findByBuyerId(String id);
}
