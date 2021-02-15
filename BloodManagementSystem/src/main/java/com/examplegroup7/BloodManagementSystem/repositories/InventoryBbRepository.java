package com.examplegroup7.BloodManagementSystem.repositories;


import com.examplegroup7.BloodManagementSystem.models.InventoryBb;
import com.examplegroup7.BloodManagementSystem.models.InventoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryBbRepository extends JpaRepository<InventoryBb, InventoryId> {

    public InventoryBb findByInventoryId(InventoryId id);

}
