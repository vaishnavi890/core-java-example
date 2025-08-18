package com.vaishnavi.practices.multithreading.multithreadingExample;

public class Customer extends Thread {
    private String product;

    public Customer(String product) {
        this.product = product;
    }

    @Override
    public void run() {
        System.out.println("Customer placed order for: " + product + " | " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // simulate order confirmation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Order confirmed for: " + product);
    }
}
