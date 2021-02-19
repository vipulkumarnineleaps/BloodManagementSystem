package com.examplegroup7.BloodManagementSystem.models;

import com.examplegroup7.BloodManagementSystem.utils.DriveInvitedDonorPK;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(DriveInvitedDonorPK.class)
@Table(name="drive_invited_donor")
@EntityListeners(AuditingEntityListener.class)

public class DriveInvitedDonor {

    @Id
    @Column(name="drive_id")
    private String driveId;

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

    public DriveInvitedDonor(){
        super();
    }

    public DriveInvitedDonor(String driveId, String userId, Integer donationStatus, Integer acceptance, String rejectionMessage, Timestamp responseTimeStamp, Timestamp donationDate) {
        this.driveId = driveId;
        this.userId = userId;
        this.donationStatus = donationStatus;
        this.acceptance = acceptance;
        this.rejectionMessage = rejectionMessage;
        this.responseTimeStamp = responseTimeStamp;
        this.donationDate = donationDate;
    }

    public String getDriveId() {
        return driveId;
    }

    public void setDriveId(String driveId) {
        this.driveId = driveId;
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
        return "DriveInvitedDonor{" +
                "driveId='" + driveId + '\'' +
                ", userId='" + userId + '\'' +
                ", donationStatus=" + donationStatus +
                ", acceptance=" + acceptance +
                ", rejectionMessage='" + rejectionMessage + '\'' +
                ", responseTimeStamp=" + responseTimeStamp +
                ", donationDate=" + donationDate +
                '}';
    }
}
