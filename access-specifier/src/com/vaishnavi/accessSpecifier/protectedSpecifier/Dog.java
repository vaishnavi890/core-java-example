package com.vaishnavi.accessSpecifier.protectedSpecifier;

public class Dog extends Animal {
    public void setDogName(String dogName) {
        name = dogName; // allowed because 'name' is protected
    }

    public void showDogName() {
        displayName(); // allowed because displayName() is protected
    }
}

