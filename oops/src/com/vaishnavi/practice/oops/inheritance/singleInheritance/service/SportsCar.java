package com.vaishnavi.practice.oops.inheritance.singleInheritance.service;

import com.vaishnavi.practice.oops.inheritance.singleInheritance.model.Car;

public class SportsCar extends Car {
    String turboMode;

    // Constructor - Calls the superclass constructor using 'super'
    public SportsCar(String brand, int speed, String turboMode) {
        super(brand, speed); // Calling Car's constructor
        this.turboMode = turboMode;
    }

    // Additional method
    public void showTurboMode() {
        System.out.println("Turbo Mode: " + turboMode);
    }
}
