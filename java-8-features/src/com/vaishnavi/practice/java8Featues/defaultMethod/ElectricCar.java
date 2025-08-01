package com.vaishnavi.practice.java8Featues.defaultMethod;

class ElectricCar implements Vehicle {
    @Override
    public void start() {
        System.out.println("Electric Car started silently");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel: Electric");
    }
}
