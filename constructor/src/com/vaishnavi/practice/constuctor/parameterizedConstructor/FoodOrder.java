package com.vaishnavi.practice.constuctor.parameterizedConstructor;

public class FoodOrder {
        String customerName;
        String foodItem;
        int quantity;
        double price;

        // Parameterized Constructor
        FoodOrder(String customerName, String foodItem, int quantity, double price) {
            this.customerName = customerName;
            this.foodItem = foodItem;
            this.quantity = quantity;
            this.price = price;
        }

        // Method to calculate total bill
        double calculateBill() {
            return quantity * price;
        }

        // Method to display order details
        void displayOrder() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Food Item: " + foodItem);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price per Item: ₹" + price);
            System.out.println("Total Bill: ₹" + calculateBill());
            System.out.println("-------------------------------");
        }

        public static void main(String[] args) {
            // Creating objects using parameterized constructor
            FoodOrder order1 = new FoodOrder("Vaishnavi", "Pizza", 2, 250.0);
            FoodOrder order2 = new FoodOrder("Aniket", "Burger", 3, 120.0);
            FoodOrder order3 = new FoodOrder("Riya", "Pasta", 1, 180.0);

            // Displaying details
            order1.displayOrder();
            order2.displayOrder();
            order3.displayOrder();
        }
}


