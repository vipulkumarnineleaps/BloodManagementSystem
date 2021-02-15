package com.examplegroup7.BloodManagementSystem.repositories;


import com.examplegroup7.BloodManagementSystem.models.DonationInvitedDonors;
import com.examplegroup7.BloodManagementSystem.models.DonationInvitedDonorsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationInvitedDonorsRepository extends JpaRepository<DonationInvitedDonors, DonationInvitedDonorsId> {

    public DonationInvitedDonors findByDonationInvitedDonorsId(DonationInvitedDonorsId did);

}
