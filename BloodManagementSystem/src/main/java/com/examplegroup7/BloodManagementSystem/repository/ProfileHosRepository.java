package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.models.ProfileHos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileHosRepository extends JpaRepository<ProfileHos, String> {

    public ProfileHos findByEmail(String email);
    public ProfileHos findByUserId(String id);


}