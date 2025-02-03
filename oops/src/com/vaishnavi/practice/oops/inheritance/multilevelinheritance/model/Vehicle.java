package com.vaishnavi.practice.oops.inheritance.multilevelinheritance.model;

public class Vehicle {
    String brand;
    int speed;

    protected Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    protected void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

