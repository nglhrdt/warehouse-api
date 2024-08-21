package de.devilsoft.warehouse_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.devilsoft.warehouse_api.entity.StorageUnit;
import de.devilsoft.warehouse_api.repository.StorageUnitRepository;

@Service
public class StorageUnitService {

    @Autowired
    private StorageUnitRepository storageUnitRepository;

    public Iterable<StorageUnit> getAll() {
        return storageUnitRepository.findAll();
    }

    public StorageUnit getOrCreate(String name) {
        Iterable<StorageUnit> storageUnits = storageUnitRepository.findByName(name);
        StorageUnit storageUnit = storageUnits.iterator().hasNext() ? storageUnits.iterator().next() : null;

        if (storageUnit == null) {
            storageUnit = new StorageUnit();
            storageUnit.setName(name);
            storageUnitRepository.save(storageUnit);
        }
        return storageUnit;
    }
}
