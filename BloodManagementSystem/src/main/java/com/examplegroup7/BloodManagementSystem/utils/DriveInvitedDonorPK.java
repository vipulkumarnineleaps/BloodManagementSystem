package com.examplegroup7.BloodManagementSystem.utils;

import java.io.Serializable;

public class DriveInvitedDonorPK implements Serializable {
    private String driveId;
    private String userId;

    public DriveInvitedDonorPK(){
        super();
    }
    public DriveInvitedDonorPK(String driveId, String userId) {
        this.driveId = driveId;
        this.userId = userId;
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}