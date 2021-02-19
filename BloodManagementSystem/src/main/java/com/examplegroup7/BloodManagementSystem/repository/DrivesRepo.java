package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.models.Drives;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrivesRepo extends JpaRepository<Drives, String> {

    public Drives findByDriveId(String id);
//    public List<Drives> findByState(String state);
}
