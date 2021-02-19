package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.models.DonationInvitedDonor;
import com.examplegroup7.BloodManagementSystem.utils.DonationInvitedDonorPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonationInvitedDonorRepo extends JpaRepository<DonationInvitedDonor, DonationInvitedDonorPK> {
    public List<DonationInvitedDonor> findByUserId(String id);
}
