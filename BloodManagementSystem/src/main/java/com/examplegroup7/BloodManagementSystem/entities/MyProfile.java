package com.examplegroup7.BloodManagementSystem.entities;

import javax.swing.*;

public class MyProfile{
    private String name;
    private String email;
    private String dob;
    private String bloodGroup;
    private double phone;
    private String address;
    private String state;
    private String district;
    private double pincode;

    public MyProfile(String name, String email, String dob, String bloodGroup, double phone, String address, String state, String district, double pincode){
        this.name = name;
        this.email =email;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
        this.phone = phone;
        this.address =address;
        this.state = state;
        this.district = district;
        this.pincode = pincode;
    }

    public MyProfile(){
        super();
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

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public double getPincode() {
        return pincode;
    }

    public void setPincode(double pincode) {
        this.pincode = pincode;
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



    @Override
    public String toString() {
        return "MyProfile{" +
                "name='" + name + '\'' +
                "email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                "phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", state=" + state +
                ", district='" + district + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}