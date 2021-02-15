package com.examplegroup7.BloodManagementSystem.repositories;


import com.examplegroup7.BloodManagementSystem.models.InventoryHos;
import com.examplegroup7.BloodManagementSystem.models.InventoryId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryHosRepository extends JpaRepository<InventoryHos, InventoryId> {

//    public InventoryHos findByInventoryId(InventoryId id);

    public List<InventoryHos> findByInventoryId(InventoryId id);

}