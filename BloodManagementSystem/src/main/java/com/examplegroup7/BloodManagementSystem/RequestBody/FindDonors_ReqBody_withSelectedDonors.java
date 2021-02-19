package com.examplegroup7.BloodManagementSystem.RequestBody;


import java.util.List;

public class FindDonors_ReqBody_withSelectedDonors {

    private String address;
    private String state;
    private String district;
    private Integer pincode;
    private String bloodGroup;
    private List<String> idList;

    public FindDonors_ReqBody_withSelectedDonors(String address, String state, String district, Integer pincode, String bloodGroup, List<String> idList) {
        this.address = address;
        this.state = state;
        this.district = district;
        this.pincode = pincode;
        this.bloodGroup = bloodGroup;
        this.idList = idList;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FindDonors_ReqBody_withSelectedDonors(){
        super();
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

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "FindDonors{" +
                "address='" + address + '\'' +
                "state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", pincode=" + pincode +
                ", bloodGroup=" + bloodGroup +
                '}';
    }
}
