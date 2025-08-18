package com.vaishnavi.practices.multithreading.multithreadingExample;

public class DeliveryBoy extends Thread {
    private String dish;

    public DeliveryBoy(String dish) {
        this.dish = dish;
    }

    @Override
    public void run() {
        System.out.println("Delivery boy picked up: " + dish);
        try {
            Thread.sleep(1500); // simulate delivery time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Delivery boy delivered: " + dish);
    }
}
