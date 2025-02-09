package com.vaishnavi.practice.oops.polymorphism.overriding.service;

public class CarService extends VehicleService{
    @Override
    public void move() {
        System.out.println("car is moving..");
    }
}

