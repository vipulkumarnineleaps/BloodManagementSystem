package com.examplegroup7.BloodManagementSystem.repository;


import com.examplegroup7.BloodManagementSystem.models.ProfileBb;
import org.springframework.data.jpa.repository.JpaRepository;

//todo to be changed
public interface ProfileBbRepository extends JpaRepository<ProfileBb, String> {

    public ProfileBb findByEmail(String email);
    public ProfileBb findByUserId(String id);
}
