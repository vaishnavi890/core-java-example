package com.vaishnavi.accessSpecifier.defaultSpecifier;

class Car { // default access (no modifier)
    String brand;  // default access
    int speed;     // default access

    // default access method
    void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
