package com.vaishnavi.practice.java8Featues.defaultMethod;

public interface LightBill {
    double RATE_PER_UNIT = 5.0; // Rate per unit of electricity

    // Default method to calculate bill
    default double calculateBill(int units) {
        return units * RATE_PER_UNIT;
    }
}
