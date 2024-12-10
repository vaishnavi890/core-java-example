package com.vaishnavi.book.inventory.service;

import com.vaishnavi.book.inventory.model.InventoryInfo;

import java.util.Scanner;

public class InventoryService {
    public InventoryInfo acceptingInventory(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter inventory id");
        int invID = Integer.parseInt(scanner.nextLine());

        System.out.println("enter book quantity");
        int bookQnt = Integer.parseInt(scanner.nextLine());

        // initialize entities
        InventoryInfo inventory = new InventoryInfo();
        inventory.invID = invID;
        inventory.bookQuantity = bookQnt;

        // We are returning an instance of the InventoryInfo class
        return inventory;

    }

}

