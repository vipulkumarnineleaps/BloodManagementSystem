package com.examplegroup7.BloodManagementSystem.utils;

import java.io.Serializable;

public class DonationInvitedDonorPK implements Serializable {
    private String donationId;
    private String userId;

    public DonationInvitedDonorPK(String donationId, String userId) {
        this.donationId = donationId;
        this.userId = userId;
    }

    public DonationInvitedDonorPK(){
        super();
    }

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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}