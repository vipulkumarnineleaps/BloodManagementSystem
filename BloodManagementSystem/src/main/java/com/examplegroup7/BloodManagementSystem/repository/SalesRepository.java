package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface SalesRepository extends JpaRepository<Sales,Long > {

    //function for retrieving sales list
    public List<Sales> findBySellerId(String id);

    //function for retrieving purchases list
    public List<Sales> findByBuyerIdAndBloodGroup(String id, String bg);
}
