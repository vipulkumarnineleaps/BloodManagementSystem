package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.entities.CurrentPassword;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CurrentPasswordRepository extends JpaRepository<CurrentPassword, Long>{
}
