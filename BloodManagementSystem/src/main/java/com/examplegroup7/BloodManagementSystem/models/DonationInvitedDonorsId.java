package com.examplegroup7.BloodManagementSystem.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DonationInvitedDonorsId implements Serializable {

    @Column(name="donation_id")
    private String donationId;

    @Column(name="user_id")
    private String userId;

    public String getDonationId() {
        return donationId;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
