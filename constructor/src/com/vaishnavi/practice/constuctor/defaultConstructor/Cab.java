package com.vaishnavi.practice.constuctor.defaultConstructor;

public class Cab {
    String driverName;
    String cabNumber;
    String location;

    // Default constructor
    Cab() {
        driverName = "Not Assigned";
        cabNumber = "Not Available";
        location = "Unknown";
        System.out.println("Cab object created using Default Constructor");
    }

    void display() {
        System.out.println("Driver: " + driverName + ", Cab No: " + cabNumber + ", Location: " + location);
    }
}
