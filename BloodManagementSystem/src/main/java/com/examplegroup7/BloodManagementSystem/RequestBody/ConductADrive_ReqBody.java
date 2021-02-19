package com.examplegroup7.BloodManagementSystem.RequestBody;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;


public class ConductADrive_ReqBody {

    private String userId;
    private Timestamp startTimeStamp;
    private Timestamp endTimeStamp;
    private List<String> bloodGroups;
    private String address;
    private String state;
    private String district;
    private int pincode;
    private String message;


    public ConductADrive_ReqBody(){
        super();
    }
    public ConductADrive_ReqBody(String userId, Timestamp startTimeStamp, Timestamp endTimeStamp, List<String> bloodGroups, String address, String state, String district, int pincode, String message) {

        this.startTimeStamp = startTimeStamp;
        this.endTimeStamp = endTimeStamp;
        this.bloodGroups = bloodGroups;
        this.address = address;
        this.state = state;
        this.district = district;
        this.pincode = pincode;
        this.message = message;

    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(Timestamp startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public Timestamp getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(Timestamp endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public List<String> getBloodGroups() {
        return bloodGroups;
    }

    public void setBloodGroups(List<String> bloodGroups) {
        this.bloodGroups = bloodGroups;
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

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    @Override
    public String toString() {
        return "ConductADriveReqBody{" +
                ", userId='" + userId + '\'' +
                ", startTimeStamp=" + startTimeStamp +
                ", endTimeStamp=" + endTimeStamp +
                ", bloodGroups=" + bloodGroups +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", pincode=" + pincode +
                ", message='" + message + '\'' +
                '}';
    }
}
