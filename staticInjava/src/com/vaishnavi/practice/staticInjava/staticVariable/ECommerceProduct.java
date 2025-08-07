package com.vaishnavi.practice.staticInjava.staticVariable;

public class ECommerceProduct {
    // Static variable - shared by all products
    static String platformName = "ShopNow E-Commerce";

    // Instance variables
    int productId;
    String productName;
    double price;

    // Constructor
    public ECommerceProduct(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Display product details
    public void displayProductDetails() {
        System.out.println("Platform: " + platformName);
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        // Create product objects
        ECommerceProduct product1 = new ECommerceProduct(101, "Laptop", 55000.00);
        ECommerceProduct product2 = new ECommerceProduct(102, "Smartphone", 25000.00);

        // Display details
        product1.displayProductDetails();
        System.out.println("----------------------------");
        product2.displayProductDetails();
    }
}
