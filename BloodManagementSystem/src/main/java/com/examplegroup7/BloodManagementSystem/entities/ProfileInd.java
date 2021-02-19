package com.examplegroup7.BloodManagementSystem.entities;

import com.examplegroup7.BloodManagementSystem.StringSequenceIdentifier;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="individual")
@EntityListeners(AuditingEntityListener.class)
public class ProfileInd {
    @Id


    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "drive_seq")
    @GenericGenerator(
            name = "drive_seq",
            strategy = "com.examplegroup7.BloodManagementSystem.StringSequenceIdentifier",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringSequenceIdentifier.INCREMENT_PARAM, value = "1"),
                    @org.hibernate.annotations.Parameter(name = StringSequenceIdentifier.VALUE_PREFIX_PARAMETER, value = "DRV"),
                    @org.hibernate.annotations.Parameter(name = StringSequenceIdentifier.NUMBER_FORMAT_PARAMETER, value = "%02d") })



    @Column(name="user_id")
    private String userId;

    private String name;

    @Column(name="blood_group")
    private String bloodGroup;
    private String email;
    private Date dob;
    private String phone;
    private String address;
    private String state;
    private String district;
    private String pincode;
    private String password;
    private Timestamp registration_date;
    private Timestamp last_donation_date;
    @Column(name="donor_status")
    private int donorStatus;


    public ProfileInd() {
        super();
    }

    public ProfileInd(String name, String bloodGroup, String email,
                      Date dob, String phone, String address, String state,
                      String district, String pincode, String password,
                      Timestamp registration_date, Timestamp last_donation_date, int donorStatus) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.state = state;
        this.district = district;
        this.pincode = pincode;
        this.password = password;
        this.registration_date = registration_date;
        this.last_donation_date = last_donation_date;
        this.donorStatus = donorStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Timestamp registration_date) {
        this.registration_date = registration_date;
    }

    public Timestamp getLast_donation_date() {
        return last_donation_date;
    }

    public void setLast_donation_date(Timestamp last_donation_date) {
        this.last_donation_date = last_donation_date;
    }

    public int getDonorStatus() {
        return donorStatus;
    }

    public void setDonorStatus(int donorStatus) {
        this.donorStatus = donorStatus;
    }
}
