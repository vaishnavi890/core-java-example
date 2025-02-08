package com.vaishnavi.practice.abstraction.service;

public class TriangleService implements ShapeService{
    private double base, height;

    public TriangleService(int i, int i1) {
    }

    public void Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    @Override
    public void display() {
        System.out.println("This is a Triangle with base " + base + " and height " + height);
    }
}

