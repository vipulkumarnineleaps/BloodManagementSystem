package com.examplegroup7.BloodManagementSystem.entities;

public class Bloodbankdetails {
    private long bb_id;
    private String bb_name;
    private String bb_address;

    public Bloodbankdetails(long bb_id, String bb_name, String bb_address) {
        this.bb_id = bb_id;
        this.bb_name = bb_name;
        this.bb_address = bb_address;
    }

    public Bloodbankdetails() {
        super();
    }

    public long getBb_id() {
        return bb_id;
    }

    public void setBb_id(long bb_id) {
        this.bb_id = bb_id;
    }

    public String getBb_name() {
        return bb_name;
    }

    public void setBb_name(String bb_name) {
        this.bb_name = bb_name;
    }

    public String getBb_address() {
        return bb_address;
    }

    public void setBb_address(String bb_address) {
        this.bb_address = bb_address;
    }

    @Override
    public String toString() {
        return "Bloodbankdetails{" +
                "bb_id=" + bb_id +
                ", bb_name='" + bb_name + '\'' +
                ", bb_address='" + bb_address + '\'' +
                '}';
    }
}
