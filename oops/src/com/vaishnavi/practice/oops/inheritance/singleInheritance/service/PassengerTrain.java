package com.vaishnavi.practice.oops.inheritance.singleInheritance.service;

import com.vaishnavi.practice.oops.inheritance.singleInheritance.model.Train;

public class PassengerTrain extends Train {
    private String serviceType; // e.g., "Express", "Local"

    // Constructor to initialize model, capacity, and service type
    public PassengerTrain(String model, int capacity, String serviceType) {
        super(model, capacity); // Call the constructor of the superclass
        this.serviceType = serviceType;
    }

    // Overriding the start method to include service type information
    @Override
    public void start() {
        System.out.println("The " + serviceType + " passenger train is starting.");
    }

    // Method to display passenger train details
    public void displayPassengerTrainDetails() {
        displayDetails(); // Call the superclass method to display common details
        System.out.println("Service Type: " + serviceType);
    }
}
