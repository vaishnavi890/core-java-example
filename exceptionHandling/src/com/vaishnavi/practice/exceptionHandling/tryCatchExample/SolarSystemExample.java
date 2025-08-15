package com.vaishnavi.practice.exceptionHandling.tryCatchExample;

import com.vaishnavi.practice.exceptionHandling.exception.PlanetNotFoundException;

public class SolarSystemExample {
    public static void main(String[] args) {
        try {
            String planet = "Pluto"; // Let’s search for Pluto
            findPlanet(planet);
            System.out.println(planet + " found in the Solar System!");
        }
        catch (PlanetNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
        finally {
            System.out.println("Planet search completed. 🌍");
        }
    }

    // Method that throws a custom exception
    public static void findPlanet(String planetName) throws PlanetNotFoundException {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        boolean found = false;
        for (String planet : planets) {
            if (planet.equalsIgnoreCase(planetName)) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new PlanetNotFoundException(planetName + " is not in the official Solar System.");
        }
    }
}
