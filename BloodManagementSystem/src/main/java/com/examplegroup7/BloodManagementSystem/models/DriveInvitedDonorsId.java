package com.examplegroup7.BloodManagementSystem.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DriveInvitedDonorsId implements Serializable {
    @Column(name="drive_id")
    private String driveId;

    @Column(name="user_id")
    private String userId;

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
}
