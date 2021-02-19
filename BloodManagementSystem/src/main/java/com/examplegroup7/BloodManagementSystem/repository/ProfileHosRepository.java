package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.entities.ProfileHos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileHosRepository extends  JpaRepository<ProfileHos, Integer> {

    public ProfileHos findByUserId(String id);
}




