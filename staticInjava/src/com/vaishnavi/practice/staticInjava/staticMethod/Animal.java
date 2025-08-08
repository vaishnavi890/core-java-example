package com.vaishnavi.practice.staticInjava.staticMethod;

public class Animal {

    // Static method for making a sound
    public static void makeSound(String animal) {
        switch (animal.toLowerCase()) {
            case "dog":
                System.out.println("Dog says: Woof Woof!");
                break;
            case "cat":
                System.out.println("Cat says: Meow!");
                break;
            case "cow":
                System.out.println("Cow says: Moo!");
                break;
            case "lion":
                System.out.println("Lion says: Roar!");
                break;
            default:
                System.out.println(animal + " sound is unknown.");
        }
    }

    // Static method for eating
    public static void eat(String animal, String food) {
        System.out.println(animal + " is eating " + food + ".");
    }

    public static void main(String[] args) {
        System.out.println("=== Animal Action System ===");

        // Calling static methods without creating an object
        Animal.makeSound("Dog");
        Animal.makeSound("Cat");
        Animal.eat("Dog", "Bones");
        Animal.eat("Cat", "Fish");
        Animal.makeSound("Lion");
    }
}


