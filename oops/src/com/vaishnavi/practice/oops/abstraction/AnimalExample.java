package com.vaishnavi.practice.oops.abstraction;

import com.vaishnavi.practice.oops.abstraction.model.Animal;
import com.vaishnavi.practice.oops.abstraction.service.CatService;
import com.vaishnavi.practice.oops.abstraction.service.DogService;

public class AnimalExample {
    public static void main(String[] args) {
        Animal myDog = new DogService();

        Animal myCat = new CatService();

        myDog.makeSound(); // Outputs: Woof! Woof!
        myDog.sleep();     // Outputs: This animal is sleeping.

        myCat.makeSound(); // Outputs: Meow! Meow!
        myCat.sleep();     // Outputs: This animal is sleeping.
    }
}

