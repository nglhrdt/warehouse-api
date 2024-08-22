package de.devilsoft.warehouse_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.devilsoft.warehouse_api.entity.StorageUnit;
import de.devilsoft.warehouse_api.service.StorageUnitService;

@RestController
@RequestMapping("/api/storage-units")
public class StorageUnitController {

    @Autowired
    private StorageUnitService storageUnitService;

    @GetMapping
    public Iterable<StorageUnit> getAll() {
        return storageUnitService.getAll();
    }
}
