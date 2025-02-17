package com.vaishnavi.practice.java8Featues.forEachMethod;

import java.util.ArrayList;
import java.util.List;

public class AnimalExample {
    public static void main(String[] args) {
        // Create a list of animals
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");

        // Using forEach with a lambda expression
        animals.forEach(animal -> System.out.println("Animal: " + animal));

        // Using forEach with a method reference
        animals.forEach(System.out::println);
    }
}
