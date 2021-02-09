package com.examplegroup7.BloodManagementSystem.entities;

public class MyCommintmentDetails {
    private String commit_type;
    private String commit_address;
    private Long drive_id;

    public MyCommintmentDetails(String commit_type, Long drive_id, String commit_address) {
        this.commit_type = commit_type;
        this.commit_address = commit_address;
        this.drive_id = drive_id;
    }

    public MyCommintmentDetails() {
        super();
    }

    public String getCommit_type() {
        return commit_type;
    }

    public void setCommit_type(String commit_type) {
        this.commit_type = commit_type;
    }

    public String getCommit_address() {
        return commit_address;
    }

    public void setCommit_address(String commit_address) {
        this.commit_address = commit_address;
    }

    public Long getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(Long drive_id) {
        this.drive_id = drive_id;
    }
}
