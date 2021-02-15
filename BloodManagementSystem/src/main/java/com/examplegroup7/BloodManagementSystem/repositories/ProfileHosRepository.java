package com.examplegroup7.BloodManagementSystem.repositories;

import com.examplegroup7.BloodManagementSystem.models.ProfileHos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileHosRepository extends JpaRepository<ProfileHos, Integer> {

    public ProfileHos findByUserId(String id);

}
