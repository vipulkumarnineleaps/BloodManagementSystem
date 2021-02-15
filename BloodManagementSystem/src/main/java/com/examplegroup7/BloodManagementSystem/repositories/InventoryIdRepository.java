package com.examplegroup7.BloodManagementSystem.repositories;


import com.examplegroup7.BloodManagementSystem.models.InventoryHos;

import java.util.List;

public interface InventoryIdRepository {
    public List<InventoryHos> findByUserId(int userid);

}
