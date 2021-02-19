package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.models.DriveInvitedDonor;
import com.examplegroup7.BloodManagementSystem.utils.DriveInvitedDonorPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriveInvitedDonorRepo extends JpaRepository<DriveInvitedDonor, DriveInvitedDonorPK> {
    public List<DriveInvitedDonor> findByUserId(String id);
}
