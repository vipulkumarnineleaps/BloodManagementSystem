package com.examplegroup7.BloodManagementSystem.repository;
import com.examplegroup7.BloodManagementSystem.entities.ProfileInd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileIndRepository extends  JpaRepository<ProfileInd, Integer> {

    public ProfileInd findByUserId(String id);
}