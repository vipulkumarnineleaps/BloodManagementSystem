package com.examplegroup7.BloodManagementSystem.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "inventory_hos")
@EntityListeners(AuditingEntityListener.class)
public class InventoryHos {

    @EmbeddedId
    private InventoryId inventoryId;

    private int units;


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
