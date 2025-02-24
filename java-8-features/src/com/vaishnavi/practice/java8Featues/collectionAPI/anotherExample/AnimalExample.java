package com.vaishnavi.practice.java8Featues.collectionAPI.anotherExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalExample {
    public static void main(String[] args) {
        // Creating a List of Animals
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1, "Leo", "Lion", 5, 190.5));
        animals.add(new Animal(2, "Bella", "Elephant", 10, 540.0));
        animals.add(new Animal(3, "Charlie", "Giraffe", 7, 300.8));
        animals.add(new Animal(4, "Max", "Tiger", 4, 210.3));

        // Sorting Animals by Age (Ascending)
        Collections.sort(animals, Comparator.comparingInt(Animal::getAge));

        System.out.println("\nAnimals sorted by age:");
        animals.forEach(System.out::println);

        // Filtering Animals with Weight greater than 200 kg
        List<Animal> heavyAnimals = animals.stream()
                .filter(animal -> animal.getWeight() > 200)
                .collect(Collectors.toList());

        System.out.println("\nAnimals with weight greater than 200 kg:");
        heavyAnimals.forEach(System.out::println);

        // Searching for an Animal by ID
        int searchId = 2;
        Animal foundAnimal = animals.stream()
                .filter(animal -> animal.getId() == searchId)
                .findFirst()
                .orElse(null);

        System.out.println("\nSearch result for Animal ID " + searchId + ": " + (foundAnimal != null ? foundAnimal : "Not Found"));
    }
}
