package de.devilsoft.warehouse_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.devilsoft.warehouse_api.entity.Item;
import de.devilsoft.warehouse_api.entity.Product;
import de.devilsoft.warehouse_api.entity.StorageUnit;
import de.devilsoft.warehouse_api.repository.ItemRepository;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private StorageUnitService storageUnitService;

    public Iterable<Item> getAll() {
        return itemRepository.findAll();
    }

    public Item getByProductAndStorageUnit(String productName, String storageUnitName) {
        Product product = productService.getOrCreate(productName);
        StorageUnit storageUnit = storageUnitService.getOrCreate(storageUnitName);

        final Iterable<Item> items = itemRepository.findByProductAndStorageUnit(product, storageUnit);

        if (items.iterator().hasNext()) {
            return items.iterator().next();
        }

        final Item item = new Item();
        item.setProduct(product);
        item.setStorageUnit(storageUnit);
        item.setAmount(0);

        return itemRepository.save(item);
    }

    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
