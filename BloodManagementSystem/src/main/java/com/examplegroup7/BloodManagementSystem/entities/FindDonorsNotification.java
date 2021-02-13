package com.examplegroup7.BloodManagementSystem.entities;

public class FindDonorsNotification {

    private int id;
    private String name;

    public FindDonorsNotification(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public FindDonorsNotification(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FindDonorsPost{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
