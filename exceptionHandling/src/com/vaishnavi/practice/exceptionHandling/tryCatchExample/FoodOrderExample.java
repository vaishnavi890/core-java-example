package com.vaishnavi.practice.exceptionHandling.tryCatchExample;

import com.vaishnavi.practice.exceptionHandling.exception.FoodNotAvailableException;

public class FoodOrderExample {
    public static void main(String[] args) {
        try {
            String foodItem = "Pizza"; // Try changing to "Burger" or "Dosa"
            orderFood(foodItem);
            System.out.println(foodItem + " is served! 🍽️");
        }
        catch (FoodNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for visiting our restaurant! 🍴");
        }
    }

    // Method that throws a custom exception
    public static void orderFood(String foodName) throws FoodNotAvailableException {
        String[] menu = {"Burger", "Pasta", "Sandwich", "Salad"};

        boolean found = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(foodName)) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new FoodNotAvailableException(foodName + " is not available on the menu.");
        }
    }
}
