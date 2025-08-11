package com.vaishnavi.accessSpecifier.defaultSpecifier;

public class GarageTest {
    public static void main(String[] args) {
        Car c = new Car();  // ✅ Works (same package)
        c.brand = "Toyota";
        c.speed = 120;
        c.showDetails();
    }
}
