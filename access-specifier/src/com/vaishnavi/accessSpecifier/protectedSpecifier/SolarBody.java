package com.vaishnavi.accessSpecifier.protectedSpecifier;

public class SolarBody {
    protected String name; // Protected: accessible in same package & subclasses
    protected double mass; // in kilograms

    protected void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Mass: " + mass + " kg");
    }
}

