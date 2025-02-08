package com.vaishnavi.practice.abstraction.service;

public class CircleService implements ShapeService {
    private double radius;

    public CircleService(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void display() {
        System.out.println("This is a Circle with radius " + radius);
    }
}

