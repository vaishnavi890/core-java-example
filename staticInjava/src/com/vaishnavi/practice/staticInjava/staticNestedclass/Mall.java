package com.vaishnavi.practice.staticInjava.staticNestedclass;

// Outer class
public class Mall {

    private String mallName = "City Center";

    // Static nested class
    public static class Shop {
        private String shopName;
        private String category;

        public Shop(String shopName, String category) {
            this.shopName = shopName;
            this.category = category;
        }

        public void displayShopDetails() {
            System.out.println("Shop Name: " + shopName);
            System.out.println("Category: " + category);
        }
    }

    // Method to display mall name
    public void displayMallName() {
        System.out.println("Mall Name: " + mallName);
    }

    public static void main(String[] args) {
        // Creating object of static nested class without outer class object
        Mall.Shop shop1 = new Mall.Shop("Trendy Wear", "Clothing");
        Mall.Shop shop2 = new Mall.Shop("Food Express", "Food Court");

        // Display details
        shop1.displayShopDetails();
        System.out.println("-------------------");
        shop2.displayShopDetails();
    }
}

