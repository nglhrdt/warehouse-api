package de.devilsoft.warehouse_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.devilsoft.warehouse_api.entity.Item;
import de.devilsoft.warehouse_api.entity.Product;
import de.devilsoft.warehouse_api.entity.StorageUnit;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Iterable<Item> findByProductAndStorageUnit(Product product, StorageUnit storageUnit);
}
