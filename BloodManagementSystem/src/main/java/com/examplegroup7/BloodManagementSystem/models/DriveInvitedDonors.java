package com.examplegroup7.BloodManagementSystem.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@Table(name = "drive_invited_donors")
@EntityListeners(AuditingEntityListener.class)
public class DriveInvitedDonors {


    @EmbeddedId
    private DriveInvitedDonorsId driveInvitedDonorsId;

    private boolean donation_status;

    private int acceptance;

    private String rejection_message;

    public DriveInvitedDonorsId getDriveInvitedDonorsId() {
        return driveInvitedDonorsId;
    }

    public void setDriveInvitedDonorsId(DriveInvitedDonorsId driveInvitedDonorsId) {
        this.driveInvitedDonorsId = driveInvitedDonorsId;
    }

    public boolean isDonation_status() {
        return donation_status;
    }

    public void setDonation_status(boolean donation_status) {
        this.donation_status = donation_status;
    }

    public int getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(int acceptance) {
        this.acceptance = acceptance;
    }

    public String getRejection_message() {
        return rejection_message;
    }

    public void setRejection_message(String rejection_message) {
        this.rejection_message = rejection_message;
    }
}
