package com.vaishnavi.practices.multithreading.interThreading.notifyAll;

public class TravelStation {
    private boolean busArrived = false;

    public synchronized void busArrival() {
        System.out.println("Bus is arriving at the travel station...");
        try {
            Thread.sleep(1000); // Simulating bus arrival delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        busArrived = true;
        System.out.println("Bus has arrived! All passengers can board.");
        notifyAll(); // Notify all waiting passengers
    }

    public synchronized void waitForBus(String passengerName) {
        while (!busArrived) {
            try {
                System.out.println(passengerName + " is waiting for the bus...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(passengerName + " has boarded the bus!");
    }
}
