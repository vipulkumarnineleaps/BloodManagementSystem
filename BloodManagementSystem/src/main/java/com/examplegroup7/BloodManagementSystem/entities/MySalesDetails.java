package com.examplegroup7.BloodManagementSystem.entities;

public class MySalesDetails {

    private long MySales_id;

    public MySalesDetails(long mySales_id) {
        MySales_id = mySales_id;
    }
    public MySalesDetails()
    {
        super();
    }

    public long getMySales_id() {
        return MySales_id;
    }

    public void setMySales_id(long mySales_id) {
        MySales_id = mySales_id;
    }

    @Override
    public String toString() {
        return "MySalesDetails{" +
                "MySales_id=" + MySales_id +
                '}';
    }
}
