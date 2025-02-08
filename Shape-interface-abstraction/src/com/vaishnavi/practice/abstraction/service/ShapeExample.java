package com.vaishnavi.practice.abstraction.service;


public class ShapeExample {
    public static void main(String[] args) {
        ShapeService circle = new CircleService(5);
        ShapeService rectangle = new RectangleService(4, 6);
        ShapeService triangle = new TriangleService(3, 8);

        circle.display();
        circle.calculateArea();

        System.out.println();

        rectangle.display();
        rectangle.calculateArea();

        System.out.println();

        triangle.display();
        triangle.calculateArea();
    }
}

