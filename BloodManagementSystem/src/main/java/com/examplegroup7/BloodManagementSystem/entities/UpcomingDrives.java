package com.examplegroup7.BloodManagementSystem.entities;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name ="drives")
@EntityListeners(AuditingEntityListener.class)

public class UpcomingDrives {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long Id;
    private String userId;
    private String state;
    private String district;
    private double pincode;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getPincode() {
        return pincode;
    }

    public void setPincode(double pincode) {
        this.pincode = pincode;
    }
}
