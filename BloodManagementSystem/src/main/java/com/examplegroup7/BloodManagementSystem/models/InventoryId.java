package com.examplegroup7.BloodManagementSystem.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class InventoryId implements Serializable {
    //TODO CHANGE THIS TO STRING.
    @Column (name = "user_id")
    private String userId;

    @Column(name ="component    ", nullable = false)
    private String component;

    @Column(name ="blood_group", nullable = false)
    private String bloodGroup;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
