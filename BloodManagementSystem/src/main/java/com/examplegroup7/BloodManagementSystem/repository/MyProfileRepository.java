package com.examplegroup7.BloodManagementSystem.repository;
import com.examplegroup7.BloodManagementSystem.entities.MyProfile;

import java.util.List;

public interface MyProfileRepository {
    public List<MyProfile>  getProfileDetails();
}