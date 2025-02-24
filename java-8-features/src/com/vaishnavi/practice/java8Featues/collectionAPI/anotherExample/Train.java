package com.vaishnavi.practice.java8Featues.collectionAPI.anotherExample;

public class Train {
    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private double price;

    // Constructor
    public Train(int trainNumber, String trainName, String source, String destination, double price) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    // Getters
    public int getTrainNumber() { return trainNumber; }
    public String getTrainName() { return trainName; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public double getPrice() { return price; }

    // toString() for printing
    @Override
    public String toString() {
        return "Train{TrainNo=" + trainNumber + ", Name='" + trainName + "', Source='" + source +
                "', Destination='" + destination + "', Price=" + price + "}";
    }
}
