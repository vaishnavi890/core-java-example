package com.vaishnavi.practice.java8Featues.functionalInterface.anotherExample;

import java.util.ArrayList;
import java.util.List;


public class AnimalExample {
    public static void main(String[] args) {
        // Functional Interface using Lambda Expression
        Animal sound = (animal) -> System.out.println(animal + " makes a sound!");

        // Using Functional Interface
        sound.makeSound("Dog");
        sound.makeSound("Cat");

        // List of Animals
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Monkey");

        // Using Lambda Expression to iterate through List
        System.out.println("\nList of Animals:");
        animals.forEach(animal -> System.out.println(animal));

        // Using Stream API to filter animals whose name starts with 'L'
        System.out.println("\nAnimals starting with 'L':");
        animals.stream()
                .filter(animal -> animal.startsWith("L"))
                .forEach(System.out::println);
    }
}
