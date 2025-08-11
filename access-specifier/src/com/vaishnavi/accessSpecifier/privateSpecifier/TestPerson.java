package com.vaishnavi.accessSpecifier.privateSpecifier;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Vaishnavi", 22);

        // ✅ Access through public methods
        p.displayInfo();
        System.out.println("Name from getter: " + p.getName());

        // ❌ Direct access is not allowed
        // p.name = "Anjali";  // ERROR
        // System.out.println(p.age); // ERROR
    }
}


