package com.examplegroup7.BloodManagementSystem.repositories;

import com.examplegroup7.BloodManagementSystem.models.ProfileInd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileIndRepository extends JpaRepository<ProfileInd, Integer> {

    public ProfileInd findByUserId(String id);

}
