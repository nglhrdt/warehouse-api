package de.devilsoft.warehouse_api.request;

public class WarehouseTransactionRequest {
    private String productName;
    private String storageUnitName;
    private int amount;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStorageUnitName() {
        return storageUnitName;
    }

    public void setStorageUnitName(String storageUnitName) {
        this.storageUnitName = storageUnitName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int quantity) {
        this.amount = quantity;
    }
}
