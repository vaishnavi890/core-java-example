package com.vaishnavi.practice.java8Featues.defaultMethod;

interface Vehicle {
    // Abstract method
    void start();

    // Default method with body
    default void fuelType() {
        System.out.println("Default Fuel: Petrol");
    }
}
