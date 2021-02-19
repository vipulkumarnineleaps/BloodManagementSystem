package com.examplegroup7.BloodManagementSystem.entities;

import com.examplegroup7.BloodManagementSystem.StringSequenceIdentifier;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="hospital")
@EntityListeners(AuditingEntityListener.class)
public class ProfileHos {
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

    private String email;
    private String license_number;
    private String phone1;
    private String phone2;
    private String phone3;
    private String phone4;
    private String phone5;
    private String address;
    private String state;
    private String district;
    private String pincode;
    private String password;
    private Timestamp registration_date;
    private Timestamp last_donation_date;
    @Column(name="donor_status")
    private int donorStatus;

    public ProfileHos() {
        super();
    }

    public ProfileHos(String name, String email,
                      String license_number, String phone1,
                      String phone2, String phone3, String phone4,
                      String phone5, String address, String state,
                      String district, String pincode, String password,
                      Timestamp registration_date, Timestamp last_donation_date,
                      int donorStatus) {
        this.name = name;
        this.email = email;
        this.license_number = license_number;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        this.phone4 = phone4;
        this.phone5 = phone5;
        this.address = address;
        this.state = state;
        this.district = district;
        this.pincode = pincode;
        this.password = password;
        this.registration_date = registration_date;
        this.last_donation_date = last_donation_date;
        this.donorStatus = donorStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public String getPhone4() {
        return phone4;
    }

    public void setPhone4(String phone4) {
        this.phone4 = phone4;
    }

    public String getPhone5() {
        return phone5;
    }

    public void setPhone5(String phone5) {
        this.phone5 = phone5;
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
