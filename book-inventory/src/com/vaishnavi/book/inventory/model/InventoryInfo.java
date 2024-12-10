package com.vaishnavi.book.inventory.model;

public class InventoryInfo {
    public int invID;
    public int bookQuantity;

    @Override
    public String toString() {
        return "InventoryInfo{" +
                "invID=" + invID +
                ", bookQuantity=" + bookQuantity +
                '}';
    }
}

