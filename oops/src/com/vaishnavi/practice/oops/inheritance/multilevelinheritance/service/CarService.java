package com.vaishnavi.practice.oops.inheritance.multilevelinheritance.service;

import com.vaishnavi.practice.oops.inheritance.multilevelinheritance.model.Vehicle;

public class CarService extends Vehicle {
    int wheels;

    CarService(String brand, int speed, int wheels) {
        super(brand, speed);
        this.wheels = wheels;
    }

    void showCarDetails() {
        display();
        System.out.println("Wheels: " + wheels);
    }
}

