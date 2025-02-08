package com.vaishnavi.practice.abstraction.service;

public class RectangleService implements ShapeService {
    private double length, width;

    public RectangleService(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void display() {
        System.out.println("This is a Rectangle with length " + length + " and width " + width);
    }
}

