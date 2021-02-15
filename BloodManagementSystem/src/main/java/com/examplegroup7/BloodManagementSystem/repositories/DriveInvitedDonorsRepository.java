package com.examplegroup7.BloodManagementSystem.repositories;

import com.examplegroup7.BloodManagementSystem.models.DriveInvitedDonors;
import com.examplegroup7.BloodManagementSystem.models.DriveInvitedDonorsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveInvitedDonorsRepository extends JpaRepository<DriveInvitedDonors, DriveInvitedDonorsId> {

    public DriveInvitedDonors findByDriveInvitedDonorsId(DriveInvitedDonorsId did);

}
