package com.vaishnavi.practice.java8Featues.functionalInterface.model;

public class Train {
    private String name;
    private int number;
    private String source;
    private String destination;
    private double fare;

    // Constructor
    public Train(String name, int number, String source, String destination, double fare) {
        this.name = name;
        this.number = number;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return "Train { Name: " + name + ", Number: " + number +
                ", Source: " + source + ", Destination: " + destination +
                ", Fare: $" + fare + " }";
    }
}

