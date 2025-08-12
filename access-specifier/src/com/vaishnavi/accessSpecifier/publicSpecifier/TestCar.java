package com.vaishnavi.accessSpecifier.publicSpecifier;

public class TestCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Tesla Model S";  // ✅ public variable accessible
        c.displayModel();           // ✅ public method accessible
    }
}

