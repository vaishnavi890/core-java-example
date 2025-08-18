package com.vaishnavi.practices.multithreading.multithreadingExample;

public class FoodOrderSystem {
    public static void main(String[] args) {
        // Multiple food orders using threads
        FoodOrder order1 = new FoodOrder("Pizza");
        FoodOrder order2 = new FoodOrder("Burger");
        FoodOrder order3 = new FoodOrder("Pasta");

        // Start orders
        order1.start();
        order2.start();
        order3.start();

        // Chefs cooking
        Chef chef1 = new Chef("Pizza");
        Chef chef2 = new Chef("Burger");
        Chef chef3 = new Chef("Pasta");

        chef1.start();
        chef2.start();
        chef3.start();

        // Delivery boys delivering
        DeliveryBoy delivery1 = new DeliveryBoy("Pizza");
        DeliveryBoy delivery2 = new DeliveryBoy("Burger");
        DeliveryBoy delivery3 = new DeliveryBoy("Pasta");

        delivery1.start();
        delivery2.start();
        delivery3.start();
    }
}
