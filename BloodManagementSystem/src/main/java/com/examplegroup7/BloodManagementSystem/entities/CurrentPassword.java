package com.examplegroup7.BloodManagementSystem.entities;

public class CurrentPassword {
    private int  id;
    private String cpassword;

    public CurrentPassword(int id, String cpassword) {

        this.id = id;
        this.cpassword = cpassword;
    }
    public CurrentPassword() { super();}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    @Override
    public String toString() {
        return "CurrentPassword{" +
                "id=" + id +
                ", cpassword='" + cpassword + '\'' +
                '}';
    }
}

