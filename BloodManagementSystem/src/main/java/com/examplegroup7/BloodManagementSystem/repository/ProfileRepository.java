package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
