package com.vaishnavi.practice.exceptionHandling;

public class ExceptionTryCatchCarDemo {
    public static void main(String[] args) {
        String car = null; // Car is not initialized (null)

        try {
            // Trying to access the length of the car name
            System.out.println("Car name length: " + car.length());
        } catch (NullPointerException e) {
            // Handling the exception if the car is null
            System.out.println("Error: The car object is null. Please initialize the car.");
        }

        try {
            car = "Toyota";
            // Accessing the car name successfully
            System.out.println("Car name length: " + car.length());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

