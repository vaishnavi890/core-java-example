package com.vaishnavi.accessSpecifier.protectedSpecifier;

public class SolarSystem {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 5.972e24, 1);
        earth.showPlanetInfo();

        // Direct access to protected member from same package
        System.out.println("Accessing directly: " + earth.name);
    }
}

