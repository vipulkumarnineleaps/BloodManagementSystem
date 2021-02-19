package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.entities.ProfileBb;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileBbRepository extends  JpaRepository<ProfileBb, Integer> {

    public ProfileBb findByUserId(String id);
}




