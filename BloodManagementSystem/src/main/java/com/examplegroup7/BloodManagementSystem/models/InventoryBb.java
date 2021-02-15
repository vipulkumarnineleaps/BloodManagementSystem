package com.examplegroup7.BloodManagementSystem.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@Table(name = "inventory_bb")
@EntityListeners(AuditingEntityListener.class)
public class InventoryBb {


    @EmbeddedId
    private InventoryId inventoryId;

    private int units;

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnits() {
        return units;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(InventoryId inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setUnits(int units) {
        this.units = units;
    }

}
