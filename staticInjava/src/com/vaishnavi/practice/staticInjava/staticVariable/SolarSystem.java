package com.vaishnavi.practice.staticInjava.staticVariable;

public class SolarSystem {

    // Static variable - common to all planets
    static String sun = "The Sun";

    // Instance variables
    String planetName;
    double distanceFromSun; // in million km

    // Constructor
    public SolarSystem(String planetName, double distanceFromSun) {
        this.planetName = planetName;
        this.distanceFromSun = distanceFromSun;
    }

    // Method to display planet details
    public void displayInfo() {
        System.out.println("Planet: " + planetName);
        System.out.println("Distance from " + sun + ": " + distanceFromSun + " million km");
    }

    public static void main(String[] args) {
        // Create planet objects
        SolarSystem earth = new SolarSystem("Earth", 149.6);
        SolarSystem mars = new SolarSystem("Mars", 227.9);

        // Display information
        earth.displayInfo();
        System.out.println("-------------------");
        mars.displayInfo();
    }
}


