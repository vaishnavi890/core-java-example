package com.vaishnavi.practices.multithreading.interThreading.notifyAll;

public class MobileShopTest {
    public static void main(String[] args) throws InterruptedException {
       Customer.MobileShop shop = new Customer.MobileShop();

        // Creating multiple customer threads
        Customer customer1 = new Customer(shop, "Customer 1");
        Customer customer2 = new Customer(shop, "Customer 2");
        Customer customer3 = new Customer(shop, "Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();

        // Simulate a delay before adding a new mobile
        Thread.sleep(3000);
        shop.addMobile();
    }
}
