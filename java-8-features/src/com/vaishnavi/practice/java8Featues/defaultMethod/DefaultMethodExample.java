package com.vaishnavi.practice.java8Featues.defaultMethod;

public class DefaultMethodExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.fuelType(); // Uses default

        System.out.println("------");

        Vehicle tesla = new ElectricCar();
        tesla.start();
        tesla.fuelType(); // Overridden
    }
}

