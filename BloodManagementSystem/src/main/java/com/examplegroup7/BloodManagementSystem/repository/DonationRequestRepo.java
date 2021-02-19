package com.examplegroup7.BloodManagementSystem.repository;

import com.examplegroup7.BloodManagementSystem.models.DonationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRequestRepo extends JpaRepository<DonationRequest, String> {

    public DonationRequest findByDonationId(String id);
}
