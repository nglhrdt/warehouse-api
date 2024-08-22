package de.devilsoft.warehouse_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.devilsoft.warehouse_api.entity.Product;
import de.devilsoft.warehouse_api.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public Iterable<Product> getProductList() {
        return productService.getAll();
    }
}
