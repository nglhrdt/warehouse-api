package de.devilsoft.warehouse_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.devilsoft.warehouse_api.entity.Item;
import de.devilsoft.warehouse_api.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public Iterable<Item> getAll() {
        return itemService.getAll();
    }
}
