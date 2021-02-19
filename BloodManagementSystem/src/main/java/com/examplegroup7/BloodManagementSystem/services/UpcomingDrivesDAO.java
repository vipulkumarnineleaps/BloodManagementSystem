package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.RequestBody.UpcomingDrives_ReqBody;
import com.examplegroup7.BloodManagementSystem.ResponseBody.UpcomingDrives_RespBody;
import com.examplegroup7.BloodManagementSystem.models.*;
import com.examplegroup7.BloodManagementSystem.repository.DrivesRepo;
import com.examplegroup7.BloodManagementSystem.repository.ProfileBbRepository;
import com.examplegroup7.BloodManagementSystem.repository.ProfileHosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UpcomingDrivesDAO {

    @Autowired
    DrivesRepo drivesRepo;

    @Autowired
    ProfileBbRepository profileBbRepository;

    @Autowired
    ProfileHosRepository profileHosRepository;


    public List<UpcomingDrives_RespBody> getDrives(UpcomingDrives_ReqBody data) {

        List<Drives> driveList = new ArrayList<>();
        List<UpcomingDrives_RespBody> resultsList = new ArrayList<>();

        driveList = drivesRepo.findAll();

        // filtering the data  on basis of state ( because it's mandatory ), district , pincode
        if (!data.getState().equals("All")) {
            driveList = driveList.stream().filter(item -> item.getState().equals(data.getState())).collect(Collectors.toList());
        }
        if (!(data.getDistrict().equals("All") || data.getDistrict().equals(""))) {
            driveList = driveList.stream().filter(item -> item.getDistrict().equals(data.getDistrict())).collect(Collectors.toList());
            System.out.println("b");
        }
        if (data.getPincode() != null) {
            driveList = driveList.stream().filter(item -> item.getPincode().equals(data.getPincode())).collect(Collectors.toList());
            System.out.println("c");
        }


        for (Drives drives : driveList) {

            ProfileHos profileHos = new ProfileHos();
            ProfileBb profileBb = new ProfileBb();

            // fetching the name and contact of the organizer (HOS/BB)  from it's table using the user id
            if(drives.getUserId().substring(0,3).equals("BOB")){
                profileBb = profileBbRepository.findByUserId(drives.getUserId());
            }else{
                profileHos = profileHosRepository.findByUserId(drives.getUserId());
            }

            // list to store the invited blood groups by the drive
            List<String> bloodGroups = new ArrayList<>();

            if (drives.getaPos())
                bloodGroups.add("A+");
            if (drives.getaNeg())
                bloodGroups.add("A-");
            if (drives.getbPos())
                bloodGroups.add("B+");
            if (drives.getbNeg())
                bloodGroups.add("B-");
            if (drives.getoPos())
                bloodGroups.add("O+");
            if (drives.getoNeg())
                bloodGroups.add("O-");
            if (drives.getAbPos())
                bloodGroups.add("AB+");
            if (drives.getAbNeg())
                bloodGroups.add("AB-");


            //saving the results in the result list
            if(drives.getUserId().substring(0,3).equals("BOB")){
                resultsList.add(new UpcomingDrives_RespBody(profileBb.getName(), profileBb.getPhone1(), drives.getStartTimeStamp(), drives.getEndTimeStamp(), drives.getAddress(), drives.getState(), drives.getDistrict(), drives.getPincode(), bloodGroups));
            }else{
                resultsList.add(new UpcomingDrives_RespBody(profileHos.getName(), profileHos.getPhone1(), drives.getStartTimeStamp(), drives.getEndTimeStamp(), drives.getAddress(), drives.getState(), drives.getDistrict(), drives.getPincode(), bloodGroups));
            }

        }

        return resultsList;
    }
}
