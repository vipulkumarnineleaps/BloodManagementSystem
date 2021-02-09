package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.MyCommintmentDetails;
import com.examplegroup7.BloodManagementSystem.services.BuybloodService;
import com.examplegroup7.BloodManagementSystem.services.MyCommitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyCommitmentsController {

    @Autowired
    public MyCommitmentService myCommitmentService;

    @GetMapping("/commitment")
    public List<MyCommintmentDetails> getcommitdetails()
    {
        return this.myCommitmentService.getcommitdetails();
    }


}
