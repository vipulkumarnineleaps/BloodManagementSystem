package com.examplegroup7.BloodManagementSystem.entities;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name="profile")
@EntityListeners(AuditingEntityListener.class)

public class ProfileData {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    private String email;
    private String address;
    private String state;
    private String district;


    private Long pincode;
    private int phone1;
    private int phone2;
    private int phone3;
    private int phone4;
    private int phone5;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public int getPhone1() {
        return phone1;
    }

    public void setPhone1(int phone1) {
        this.phone1 = phone1;
    }

    public int getPhone2() {
        return phone2;
    }

    public void setPhone2(int phone2) {
        this.phone2 = phone2;
    }

    public int getPhone3() {
        return phone3;
    }

    public void setPhone3(int phone3) {
        this.phone3 = phone3;
    }

    public int getPhone4() {
        return phone4;
    }

    public void setPhone4(int phone4) {
        this.phone4 = phone4;
    }

    public int getPhone5() {
        return phone5;
    }

    public void setPhone5(int phone5) {
        this.phone5 = phone5;
    }
}
