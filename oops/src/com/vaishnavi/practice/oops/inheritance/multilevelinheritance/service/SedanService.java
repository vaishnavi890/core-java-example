package com.vaishnavi.practice.oops.inheritance.multilevelinheritance.service;

public class SedanService extends CarService {
    String model;

    public SedanService(String brand, int speed, int wheels, String model) {
        super(brand, speed, wheels);
        this.model = model;
    }

    public void showSedanDetails() {
        showCarDetails();
        System.out.println("Model: " + model);
    }
}

