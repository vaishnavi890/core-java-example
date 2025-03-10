package com.vaishnavi.practices.multithreading.threadMethod;

public class AirplaneRunExample extends Thread{
    private final String airplaneName;

    public AirplaneRunExample(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    @Override
    public void run() {
        try {
            System.out.println(airplaneName + " is preparing for takeoff.");
            Thread.sleep(1000); // Simulate preparation time
            System.out.println(airplaneName + " is taking off!");
            Thread.sleep(1000); // Simulate takeoff time
            System.out.println(airplaneName + " has successfully taken off.");
        } catch (InterruptedException e) {
            System.out.println(airplaneName + " was interrupted during takeoff.");
        }
    }

    public static void main(String[] args) {
        // Creating airplane threads
        AirplaneRunExample airplane1 = new AirplaneRunExample("Boeing 737");
        AirplaneRunExample airplane2 = new AirplaneRunExample("Airbus A320");
        AirplaneRunExample airplane3 = new AirplaneRunExample("Concorde");

        // Calling run() directly (not recommended)
        System.out.println("Calling run() directly:");
        airplane1.run();
        airplane2.run();
        airplane3.run();

        System.out.println("\nCalling start() method:");
        // Proper way to start threads using start()
        airplane1.start();
        airplane2.start();
        airplane3.start();
    }
}
