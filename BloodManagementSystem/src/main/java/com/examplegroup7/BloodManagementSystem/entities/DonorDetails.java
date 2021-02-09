package com.examplegroup7.BloodManagementSystem.entities;

public class DonorDetails {

    private String donor_name;
    private Integer donor_phone_no;
    private String donor_email;
    private String donor_bloodgroup;

    public DonorDetails(String donor_name, Integer donor_phone_no, String donor_email, String donor_bloodgroup) {
        this.donor_name = donor_name;
        this.donor_phone_no = donor_phone_no;
        this.donor_email = donor_email;
        this.donor_bloodgroup = donor_bloodgroup;
    }

    public DonorDetails() {
        super();
    }

    public String getDonor_name() {
        return donor_name;
    }

    public void setDonor_name(String donor_name) {
        this.donor_name = donor_name;
    }

    public Integer getDonor_phone_no() {
        return donor_phone_no;
    }

    public void setDonor_phone_no(Integer donor_phone_no) {
        this.donor_phone_no = donor_phone_no;
    }

    public String getDonor_email() {
        return donor_email;
    }

    public void setDonor_email(String donor_email) {
        this.donor_email = donor_email;
    }

    public String getDonor_bloodgroup() {
        return donor_bloodgroup;
    }

    public void setDonor_bloodgroup(String donor_bloodgroup) {
        this.donor_bloodgroup = donor_bloodgroup;
    }
}
