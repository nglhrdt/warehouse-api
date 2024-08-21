package de.devilsoft.warehouse_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.devilsoft.warehouse_api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Iterable<Product> findByName(String name);
}
