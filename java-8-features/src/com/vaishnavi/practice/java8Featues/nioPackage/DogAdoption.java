package com.vaishnavi.practice.java8Featues.nioPackage;

import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class DogAdoption {
    private static final String FILE_PATH = "dog_adoption_records.txt";

    // Add a new dog for adoption
    public static void addDog(int dogId, String name, String breed, int age) {
        String record = dogId + "," + name + "," + breed + "," + age + " years,Available\n";
        try {
            // Append new dog record
            Files.write(Paths.get(FILE_PATH), record.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Dog added for adoption: " + name);
        } catch (IOException e) {
            System.err.println("Error writing dog data: " + e.getMessage());
        }
    }

    // Read all available dogs for adoption
    public static void readDogs() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH), StandardCharsets.UTF_8);
            System.out.println("\n--- Available Dogs for Adoption ---");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading dog data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Add dogs for adoption
        addDog(101, "Buddy", "Golden Retriever", 3);
        addDog(102, "Max", "Beagle", 2);

        // Read and display available dogs
        readDogs();
    }
}
