package com.examplegroup7.BloodManagementSystem.models;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@Table(name = "donation_invited_donors")
@EntityListeners(AuditingEntityListener.class)
public class DonationInvitedDonors {


    @EmbeddedId
    private DonationInvitedDonorsId donationInvitedDonorsId;

    private boolean donation_status;

    private int acceptance;

    private String rejection_message;


    public DonationInvitedDonorsId getDonationInvitedDonorsId() {
        return donationInvitedDonorsId;
    }

    public void setDonationInvitedDonorsId(DonationInvitedDonorsId donationInvitedDonorsId) {
        this.donationInvitedDonorsId = donationInvitedDonorsId;
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
