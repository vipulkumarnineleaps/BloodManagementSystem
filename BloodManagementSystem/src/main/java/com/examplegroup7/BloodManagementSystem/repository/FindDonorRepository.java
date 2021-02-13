package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.entities.FindDonors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FindDonorRepository extends JpaRepository<FindDonors, Long> {
}
