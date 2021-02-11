package com.examplegroup7.BloodManagementSystem.entities;


public class ConductADrive {
    private String bg;
    private String adderss;

    public ConductADrive(String bg, String adderss) {
        this.bg = bg;
        this.adderss = adderss;
    }

    public ConductADrive(){
        super();
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    @Override
    public String toString() {
        return "ConductADrive{" +
                "bg='" + bg + '\'' +
                ", adderss='" + adderss + '\'' +
                '}';
    }
}
