package com.vaishnavi.practice.staticInjava.staticBlock;

public class Mobile {

    // Static variables
    static String brand;
    static String model;
    static double price;

    // Static block - runs once when the class is loaded
    static {
        System.out.println("Loading Mobile Specifications...");

        brand = "Samsung";
        model = "Galaxy S25 Ultra";
        price = 1299.99;

        System.out.println("Mobile Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price Loaded: $" + price);
    }

    // Static method to display details
    static void showDetails() {
        System.out.println("=== Mobile Details ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Mobile Store!");

        // Call the static method
        Mobile.showDetails();
    }
}


