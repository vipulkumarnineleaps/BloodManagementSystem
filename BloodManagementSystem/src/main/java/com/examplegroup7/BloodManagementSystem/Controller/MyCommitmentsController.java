package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.entities.MyCommintmentDetails;
import com.examplegroup7.BloodManagementSystem.repository.MyCommitmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyCommitmentsController {

    @Autowired
    public MyCommitmentRepository myCommitmentRepository;

    @GetMapping("/commitment")
    public List<MyCommintmentDetails> getcommitdetails()
    {
        return this.myCommitmentRepository.getcommitdetails();
    }


}
