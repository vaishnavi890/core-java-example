package com.vaishnavi.practice.oops.inheritance.multilevelinheritance.model;

public class Transport {
    String mode;
    int capacity;

    protected Transport(String mode, int capacity) {
        this.mode = mode;
        this.capacity = capacity;
    }

    protected void displayTransportDetails() {
        System.out.println("Mode of Transport: " + mode);
        System.out.println("Capacity: " + capacity + " passengers");
    }
}
