package de.devilsoft.warehouse_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.devilsoft.warehouse_api.entity.Product;
import de.devilsoft.warehouse_api.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getOrCreate(String name) {
        Iterable<Product> products = productRepository.findByName(name);
        Product product = products.iterator().hasNext() ? products.iterator().next() : null;

        if (product == null) {
            product = new Product();
            product.setName(name);
            productRepository.save(product);
        }
        return product;
    }
}
