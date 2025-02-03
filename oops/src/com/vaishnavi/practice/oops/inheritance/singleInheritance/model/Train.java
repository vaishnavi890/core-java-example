package com.vaishnavi.practice.oops.inheritance.singleInheritance.model;

public class Train {
    private String model;
    private int capacity;

    // Constructor to initialize model and capacity
    public Train(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    // Method to display train details
    public void displayDetails() {
        System.out.println("Train Model: " + model);
        System.out.println("Capacity: " + capacity + " passengers");
    }

    // Method to simulate the train starting
    public void start() {
        System.out.println(model + " is starting.");
    }
}
