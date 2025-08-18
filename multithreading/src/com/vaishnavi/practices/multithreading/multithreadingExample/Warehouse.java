package com.vaishnavi.practices.multithreading.multithreadingExample;

public class Warehouse extends Thread {
    private String product;

    public Warehouse(String product) {
        this.product = product;
    }

    @Override
    public void run() {
        System.out.println("Warehouse started packing: " + product);
        try {
            Thread.sleep(2000); // simulate packing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Warehouse finished packing: " + product);
    }
}
