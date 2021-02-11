package com.examplegroup7.BloodManagementSystem.entities;


public class MyPurchases {
 private String name ;
 private String date ;
 private String bloodGroup;
 private String component;
 private int units;
 private String contact;
 private Double amount;

    public MyPurchases(String name, String date, String bloodGroup, String component, int units, String contact, Double amount) {
        this.name = name;
        this.date = date;
        this.bloodGroup = bloodGroup;
        this.component = component;
        this.units = units;
        this.contact = contact;
        this.amount = amount;
    }

    public MyPurchases() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MyPurchases{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", component='" + component + '\'' +
                ", units=" + units +
                ", contact='" + contact + '\'' +
                ", amount=" + amount +
                '}';
    }
}
