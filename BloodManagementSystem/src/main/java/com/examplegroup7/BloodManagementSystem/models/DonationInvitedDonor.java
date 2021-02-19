package com.examplegroup7.BloodManagementSystem.models;

import com.examplegroup7.BloodManagementSystem.utils.DonationInvitedDonorPK;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(DonationInvitedDonorPK.class)
@Table(name="donation_invited_donor")
@EntityListeners(AuditingEntityListener.class)

public class DonationInvitedDonor {

    @Id
    @Column(name="donation_id")
    private String donationId;

    @Id
    @Column(name="user_id")
    private String userId;

    @Column( name="donation_status")
    private Integer donationStatus;

    private Integer acceptance;

    @Column( name="rejection_message")
    private String rejectionMessage;

    @Column( name="response_timestamp")
    private Timestamp responseTimeStamp;

    @Column( name="donation_date")
    private Timestamp donationDate;


    public DonationInvitedDonor(String donationId, String userId, Integer donationStatus, Integer acceptance, String rejectionMessage, Timestamp responseTimeStamp, Timestamp donationDate) {
        this.donationId = donationId;
        this.userId = userId;
        this.donationStatus = donationStatus;
        this.acceptance = acceptance;
        this.rejectionMessage = rejectionMessage;
        this.responseTimeStamp = responseTimeStamp;
        this.donationDate = donationDate;
    }

    public DonationInvitedDonor() {
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

    public Integer getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(Integer donationStatus) {
        this.donationStatus = donationStatus;
    }

    public Integer getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(Integer acceptance) {
        this.acceptance = acceptance;
    }

    public String getRejectionMessage() {
        return rejectionMessage;
    }

    public void setRejectionMessage(String rejectionMessage) {
        this.rejectionMessage = rejectionMessage;
    }

    public Timestamp getResponseTimeStamp() {
        return responseTimeStamp;
    }

    public void setResponseTimeStamp(Timestamp responseTimeStamp) {
        this.responseTimeStamp = responseTimeStamp;
    }

    public Timestamp getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Timestamp donationDate) {
        this.donationDate = donationDate;
    }

    @Override
    public String toString() {
        return "DonationInvitedDonor{" +
                "donationId='" + donationId + '\'' +
                ", userId='" + userId + '\'' +
                ", donationStatus=" + donationStatus +
                ", acceptance=" + acceptance +
                ", rejectionMessage='" + rejectionMessage + '\'' +
                ", responseTimeStamp=" + responseTimeStamp +
                ", donationDate=" + donationDate +
                '}';
    }
}
