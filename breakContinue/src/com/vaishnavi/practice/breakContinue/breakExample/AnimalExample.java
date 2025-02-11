package com.vaishnavi.practice.breakContinue.breakExample;

import com.vaishnavi.practice.breakContinue.breakExample.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalExample {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Elephant"));
        animals.add(new Animal("Tiger"));
        animals.add(new Animal("Zebra"));
        animals.add(new Animal("Giraffe"));

        String searchAnimal = "Tiger";
        System.out.println("Searching for " + searchAnimal + " in the list...");

        for (Animal animal : animals) {
            System.out.println("Checking: " + animal.getName());
            if (animal.getName().equals(searchAnimal)) {
                System.out.println(searchAnimal + " found! Breaking the loop.");
                break; // Exits the loop once the animal is found
            }
        }

        System.out.println("Search completed.");
    }
}

