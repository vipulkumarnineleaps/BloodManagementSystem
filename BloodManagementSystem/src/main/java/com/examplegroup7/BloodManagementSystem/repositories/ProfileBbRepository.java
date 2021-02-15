package com.examplegroup7.BloodManagementSystem.repositories;

import com.examplegroup7.BloodManagementSystem.models.ProfileBb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileBbRepository extends JpaRepository<ProfileBb, Integer> {

    public ProfileBb findByUserId(String id);

}
