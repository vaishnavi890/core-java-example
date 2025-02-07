package com.vaishnavi.practice.oops.abstraction.service;

import com.vaishnavi.practice.oops.abstraction.model.Animal;

public class CatService extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

