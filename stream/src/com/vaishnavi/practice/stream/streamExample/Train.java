package com.vaishnavi.practice.stream.streamExample;

public class Train {
    private int trainId;
    private String name;
    private String source;
    private String destination;
    private double fare;
    private int seatsAvailable;

    public Train(int trainId, String name, String source, String destination, double fare, int seatsAvailable) {
        this.trainId = trainId;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.seatsAvailable = seatsAvailable;
    }

    public int getTrainId() { return trainId; }
    public String getName() { return name; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public double getFare() { return fare; }
    public int getSeatsAvailable() { return seatsAvailable; }

    @Override
    public String toString() {
        return "Train{" +
                "ID=" + trainId +
                ", Name='" + name + '\'' +
                ", Source='" + source + '\'' +
                ", Destination='" + destination + '\'' +
                ", Fare=" + fare +
                ", Seats=" + seatsAvailable +
                '}';
    }
}


