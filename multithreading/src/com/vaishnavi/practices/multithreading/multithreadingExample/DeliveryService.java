package com.vaishnavi.practices.multithreading.multithreadingExample;

public class DeliveryService extends Thread {
    private String product;

    public DeliveryService(String product) {
        this.product = product;
    }

    @Override
    public void run() {
        System.out.println("Delivery service picked up: " + product);
        try {
            Thread.sleep(1500); // simulate delivery
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Delivery completed for: " + product);
    }
}
