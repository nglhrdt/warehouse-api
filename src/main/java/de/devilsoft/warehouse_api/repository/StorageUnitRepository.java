package de.devilsoft.warehouse_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.devilsoft.warehouse_api.entity.StorageUnit;

public interface StorageUnitRepository extends JpaRepository<StorageUnit, Long> {
    Iterable<StorageUnit> findByName(String name);
}
