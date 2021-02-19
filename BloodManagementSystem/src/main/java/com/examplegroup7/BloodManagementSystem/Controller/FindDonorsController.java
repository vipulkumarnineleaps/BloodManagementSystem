package com.examplegroup7.BloodManagementSystem.Controller;

import com.examplegroup7.BloodManagementSystem.RequestBody.FindDonors_ReqBody_withSelectedDonors;
import com.examplegroup7.BloodManagementSystem.ResponseBody.FindDonors_RespBody;
import com.examplegroup7.BloodManagementSystem.RequestBody.FindDonors_ReqBody;
import com.examplegroup7.BloodManagementSystem.ResponseBody.SuccessResponseBody;
import com.examplegroup7.BloodManagementSystem.services.FindDonorsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path="/finddonors")
public class FindDonorsController {

    @Autowired
    FindDonorsDAO findDonorsDAO;


    @PostMapping("/donorslist")
    public List<FindDonors_RespBody> getDonorsList(@RequestBody FindDonors_ReqBody data) {
        return findDonorsDAO.getDonorsList(data);
    }

    @PostMapping("/sendnotification")
    public ResponseEntity<SuccessResponseBody> getResponse(@RequestBody FindDonors_ReqBody_withSelectedDonors data){ return findDonorsDAO.getResponse(data);}
}
