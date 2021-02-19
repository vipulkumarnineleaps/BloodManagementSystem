package com.examplegroup7.BloodManagementSystem.Controller;


import com.examplegroup7.BloodManagementSystem.services.CommitmentsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyCommitmentsController {

    @Autowired
    CommitmentsDAO commitmentsDAO;

    @GetMapping("/commitment")
    public List<?> getcommitmentdetails()
    {
        String id = "1";
        return commitmentsDAO.getDetails(id);
    }

}
