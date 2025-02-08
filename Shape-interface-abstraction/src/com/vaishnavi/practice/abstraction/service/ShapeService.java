package com.vaishnavi.practice.abstraction.service;

public interface ShapeService {
    default void calculateArea() {
        System.out.println("Area of Shape: ");
    }

    default void display() {
        System.out.println("This is a Shape with radius " );
    }
}
