package com.examplegroup7.BloodManagementSystem.controllers;

import com.examplegroup7.BloodManagementSystem.models.InventoryBb;
import com.examplegroup7.BloodManagementSystem.models.InventoryHos;
import com.examplegroup7.BloodManagementSystem.models.InventoryId;
import com.examplegroup7.BloodManagementSystem.repositories.InventoryBbRepository;
import com.examplegroup7.BloodManagementSystem.repositories.InventoryHosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    InventoryBbRepository inventoryBbRepository;

    @Autowired
    InventoryHosRepository inventoryHosRepository;

    /////////////////////////////////////////////////////////////////? FOR TESTING ONLY

    @GetMapping("/recievehosinventoryall")
    public List<InventoryHos> extractHosInventoryAll(){
        return inventoryHosRepository.findAll();
    }

    @GetMapping("/recievebbinventoryall")
    public List<InventoryBb> extractBbInventoryAll(){
        return inventoryBbRepository.findAll();
    }


    //?////////////////////////////////////////////////////////////////////////////////////////

    @GetMapping("/recievehosinventory")
    public List<InventoryHos> extractHosInventory(){
        //! HARDCODED DATA HERE, NEED TO BE EXTRACTED FROM THE TOKEN ITSELF.
        String userId = "AAAA";

        InventoryId inventoryId = new InventoryId();
        inventoryId.setUserId(userId);

        List<InventoryHos> list = inventoryHosRepository.findByInventoryId(inventoryId);

        return list;

    }


    @PutMapping("/updatehosinventory")
    public InventoryHos updateHosInventory(@RequestBody InventoryHos inventoryHos){
        InventoryHos match = inventoryHosRepository.findByInventoryId(inventoryHos.getInventoryId()).get(0);

        match.setUnits(inventoryHos.getUnits());
        return inventoryHosRepository.save(match);

    }

    @PutMapping("/updatebbinventory")
    public InventoryBb updateBbInventory(@RequestBody InventoryBb inventoryBb){
        InventoryBb match = inventoryBbRepository.findByInventoryId(inventoryBb.getInventoryId());

        match.setUnits(inventoryBb.getUnits());
        return inventoryBbRepository.save(match);

    }

}
