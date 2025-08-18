package com.vaishnavi.practices.multithreading.multithreadingExample;

public class EcommerceSystem {
    public static void main(String[] args) {
        // Multiple customer orders
        Customer c1 = new Customer("Laptop");
        Customer c2 = new Customer("Smartphone");
        Customer c3 = new Customer("Headphones");

        c1.start();
        c2.start();
        c3.start();

        // Warehouse processes orders
        Warehouse w1 = new Warehouse("Laptop");
        Warehouse w2 = new Warehouse("Smartphone");
        Warehouse w3 = new Warehouse("Headphones");

        w1.start();
        w2.start();
        w3.start();

        // Delivery service ships orders
        DeliveryService d1 = new DeliveryService("Laptop");
        DeliveryService d2 = new DeliveryService("Smartphone");
        DeliveryService d3 = new DeliveryService("Headphones");

        d1.start();
        d2.start();
        d3.start();
    }
}
