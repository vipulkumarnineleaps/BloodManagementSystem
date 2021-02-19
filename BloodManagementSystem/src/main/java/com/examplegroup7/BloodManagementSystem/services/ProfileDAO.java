package com.examplegroup7.BloodManagementSystem.services;

import com.examplegroup7.BloodManagementSystem.entities.*;
import com.examplegroup7.BloodManagementSystem.repository.ProfileBbRepository;
import com.examplegroup7.BloodManagementSystem.repository.ProfileHosRepository;
import com.examplegroup7.BloodManagementSystem.repository.ProfileIndRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProfileDAO {

//    DAO files for initial data api

        @Autowired
        ProfileBbRepository profileBbRepository;
        @Autowired
        ProfileIndRepository profileIndRepository;
        @Autowired
        ProfileHosRepository profileHosRepository;

        public ProfileDataBb_Hos getProfileDetailsBb(String id) {
            ProfileBb obj = profileBbRepository.findByUserId(id);
            ProfileDataBb_Hos obj1 = new ProfileDataBb_Hos(obj.getName(), obj.getUserId());
            return obj1;
        }


        public ProfileDataInd getProfileDetailsInd(String id) {
            ProfileInd obj = profileIndRepository.findByUserId(id);
            ProfileDataInd obj1 = new ProfileDataInd(obj.getName(), obj.getUserId(), obj.getDonorStatus());
            return obj1;
        }


        public ProfileDataBb_Hos getProfileDetailsHos(String id) {
            ProfileHos obj = profileHosRepository.findByUserId(id);
            ProfileDataBb_Hos obj1 = new ProfileDataBb_Hos(obj.getName(), obj.getUserId());
            return obj1;
        }


//        DAO files for all data api


        public ProfileBB_HosData getProfileBbDetails(String id) {
            ProfileBb obj = profileBbRepository.findByUserId(id);
            ProfileBB_HosData obj1 = new ProfileBB_HosData(obj.getEmail(), obj.getLicense_number(), obj.getPhone1(), obj.getPhone2(), obj.getPhone3(),
                    obj.getPhone4(), obj.getPhone5(), obj.getAddress(), obj.getState(), obj.getDistrict(), obj.getPincode(), obj.getRegistration_date(),
                    obj.getLast_donation_date());
            return obj1;
        }

        public ProfileBB_HosData getProfileHosDetails(String id) {
            ProfileHos obj = profileHosRepository.findByUserId(id);
            ProfileBB_HosData obj1 = new ProfileBB_HosData(obj.getEmail(), obj.getLicense_number(), obj.getPhone1(), obj.getPhone2(), obj.getPhone3(),
                    obj.getPhone4(), obj.getPhone5(), obj.getAddress(), obj.getState(), obj.getDistrict(), obj.getPincode(), obj.getRegistration_date(),
                    obj.getLast_donation_date());
            return obj1;
        }

        public ProfileIndData getProfileIndDetails(String id) {
            ProfileInd obj = profileIndRepository.findByUserId(id);
            ProfileIndData obj1 = new ProfileIndData(obj.getBloodGroup(), obj.getEmail(), obj.getDob(),  obj.getPhone(),
                    obj.getAddress(), obj.getState(), obj.getDistrict(), obj.getPincode(), obj.getRegistration_date(),
                    obj.getLast_donation_date());
            return obj1;
        }



}
