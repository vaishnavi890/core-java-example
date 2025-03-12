package com.vaishnavi.practices.multithreading.interThreading.notifyAll;

public class Customer extends Thread {
    private final MobileShop shop;
    private final String name;

    public Customer(MobileShop shop, String name) {
        this.shop = shop;
        this.name = name;
    }

    @Override
    public void run() {
        shop.buyMobile(name);
    }


    public static class MobileShop {
        private boolean mobileAvailable = false;

        public synchronized void buyMobile(String customerName) {
            while (!mobileAvailable) {
                try {
                    System.out.println(customerName + " is waiting for a mobile...");
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
            System.out.println(customerName + " bought a mobile!");
            mobileAvailable = false;
        }

        public synchronized void addMobile() {
            mobileAvailable = true;
            System.out.println("New mobile arrived at the shop!");
            notifyAll();
        }
    }
}

