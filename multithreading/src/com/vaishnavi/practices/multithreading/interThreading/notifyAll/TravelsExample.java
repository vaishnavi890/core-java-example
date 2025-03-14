package com.vaishnavi.practices.multithreading.interThreading.notifyAll;

public class TravelsExample {
    public static void main(String[] args) {
        TravelStation station = new TravelStation();

        // Creating passenger threads
        Thread passenger1 = new Thread(new Passenger(station, "Alice"));
        Thread passenger2 = new Thread(new Passenger(station, "Bob"));
        Thread passenger3 = new Thread(new Passenger(station, "Charlie"));

        // Starting passenger threads (waiting for the bus)
        passenger1.start();
        passenger2.start();
        passenger3.start();

        // Starting the bus arrival thread
        Thread busThread = new Thread(new Bus(station));
        busThread.start();
    }
}
