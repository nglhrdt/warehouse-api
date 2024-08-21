package de.devilsoft.warehouse_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.devilsoft.warehouse_api.entity.Item;
import de.devilsoft.warehouse_api.request.WarehouseTransactionRequest;
import de.devilsoft.warehouse_api.service.WarehouseService;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @PostMapping("/transaction")
    public Item transaction(@RequestBody WarehouseTransactionRequest request) {
        return warehouseService.createTransaction(request);
    }
}
