package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.models.Individual;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FindDonorsRepo extends JpaRepository<Individual, String> {
    public List<Individual> findByBloodGroup(String bg);

    public List<Individual> findByBloodGroupIn(List<String> bg);
}
