package com.vaishnavi.practice.java8Featues.collectionAPI.anotherExample;

public class Animal {
    private int id;
    private String name;
    private String species;
    private int age;
    private double weight;

    // Constructor
    public Animal(int id, String name, String species, int age, double weight) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    // toString() for printing
    @Override
    public String toString() {
        return "Animal{ID=" + id + ", Name='" + name + "', Species='" + species +
                "', Age=" + age + ", Weight=" + weight + " kg}";
    }
}
