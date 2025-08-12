package com.vaishnavi.accessSpecifier.protectedSpecifier;

public class ZooTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Buddy";      // allowed (same package)
        d.displayName();       // allowed (same package)

        d.setDogName("Max");
        d.showDogName();
    }
}

