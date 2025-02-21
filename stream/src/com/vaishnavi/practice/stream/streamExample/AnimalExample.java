package com.vaishnavi.practice.stream.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class AnimalExample {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Animal("Lion", "Wild", 8),
                new Animal("Elephant", "Wild", 25),
                new Animal("Dog", "Domestic", 5),
                new Animal("Cat", "Domestic", 3),
                new Animal("Tiger", "Wild", 10),
                new Animal("Cow", "Domestic", 7)
        );

        // 1. Filter all domestic animals
        List<Animal> domesticAnimals = animals.stream()
                .filter(animal -> "Domestic".equals(animal.getType()))
                .collect(Collectors.toList());
        System.out.println("Domestic Animals: " + domesticAnimals);

        // 2. Get names of all animals using map
        List<String> animalNames = animals.stream()
                .map(Animal::getName)
                .collect(Collectors.toList());
        System.out.println("Animal Names: " + animalNames);

        // 3. Find the oldest animal
        Animal oldestAnimal = animals.stream()
                .max((a1, a2) -> Integer.compare(a1.getAge(), a2.getAge()))
                .orElse(null);
        System.out.println("Oldest Animal: " + oldestAnimal);

        // 4. Sort animals by age
        List<Animal> sortedByAge = animals.stream()
                .sorted((a1, a2) -> Integer.compare(a1.getAge(), a2.getAge()))
                .collect(Collectors.toList());
        System.out.println("Animals sorted by age: " + sortedByAge);

        // 5. Count the number of wild animals
        long wildAnimalCount = animals.stream()
                .filter(animal -> "Wild".equals(animal.getType()))
                .count();
        System.out.println("Number of Wild Animals: " + wildAnimalCount);

        // 6. Use forEach to print all animals
        System.out.println("All Animals:");
        animals.stream().forEach(System.out::println);
    }
}
