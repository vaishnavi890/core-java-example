package com.vaishnavi.practice.oops.polymorphism.overriding.service;

public class OverridingExample {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();
        vehicleService.move();

        vehicleService = new CarService();
        vehicleService.move();
    }
}

