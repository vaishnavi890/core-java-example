package com.vaishnavi.accessSpecifier.protectedSpecifier;

public class Planet extends SolarBody {
    private int numberOfMoons;

    public Planet(String name, double mass, int numberOfMoons) {
        this.name = name; // allowed (protected in parent)
        this.mass = mass; // allowed
        this.numberOfMoons = numberOfMoons;
    }

    public void showPlanetInfo() {
        displayDetails(); // allowed because it's protected
        System.out.println("Number of Moons: " + numberOfMoons);
    }
}


