package de.devilsoft.warehouse_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.devilsoft.warehouse_api.entity.Item;
import de.devilsoft.warehouse_api.request.WarehouseTransactionRequest;

@Service
public class WarehouseService {
    @Autowired
    private ItemService itemService;

    public Item createTransaction(WarehouseTransactionRequest request) {
        final String productName = request.getProductName();
        final String storageUnitName = request.getStorageUnitName();

        final Item item = itemService.getByProductAndStorageUnit(productName, storageUnitName);

        if (request.getAmount() < 0 && item.getAmount() < Math.abs(request.getAmount())) {
            throw new IllegalArgumentException("Not enough items in stock");
        }

        item.setAmount(item.getAmount() + request.getAmount());

        return itemService.save(item);
    }
}
