package com.vaishnavi.practices.multithreading.multithreadingExample;

public class FoodOrder extends Thread {
    private String orderName;

    public FoodOrder(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public void run() {
        System.out.println(orderName + " is placed by customer: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // simulate order processing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(orderName + " is ready for chef to cook!");
    }
}
