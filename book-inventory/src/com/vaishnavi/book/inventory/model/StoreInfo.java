package com.vaishnavi.book.inventory.model;

public class StoreInfo {
    public int storeID;
    public String storeName;
    public String shelfLocation;
    public int shelfNo;
    public int rackNo;

    @Override
    public String toString() {
        return "StoreInfo{" +
                "storeID=" + storeID +
                ", storeName='" + storeName + '\'' +
                ", shelfLocation='" + shelfLocation + '\'' +
                ", shelfNo=" + shelfNo +
                ", rackNo=" + rackNo +
                '}';
    }
}

