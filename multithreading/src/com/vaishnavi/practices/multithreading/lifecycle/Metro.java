package com.vaishnavi.practices.multithreading.lifecycle;

public class Metro extends Thread{
    private String metroName;

    public Metro(String metroName) {
        this.metroName = metroName;
    }

    // Metro lifecycle methods
    public void startMetro() {
        System.out.println(metroName + " is starting.");
    }

    public void runMetro() {
        System.out.println(metroName + " is running.");
    }

    public void stopAtStation(String stationName) {
        System.out.println(metroName + " is stopping at " + stationName + " station.");
    }

    public void terminateMetro() {
        System.out.println(metroName + " has terminated.");
    }

    @Override
    public void run() {
        try {
            startMetro();
            Thread.sleep(1000);  // Simulate starting delay

            runMetro();
            Thread.sleep(1000);  // Simulate running time

            // Simulate stopping at multiple stations
            stopAtStation("Station A");
            Thread.sleep(1000);

            runMetro();
            Thread.sleep(1000);

            stopAtStation("Station B");
            Thread.sleep(1000);

            runMetro();
            Thread.sleep(1000);

            stopAtStation("Station C");
            Thread.sleep(1000);

            terminateMetro();
        } catch (InterruptedException e) {
            System.out.println(metroName + " encountered an interruption: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Metro metro1 = new Metro("Metro Line 1");
        Metro metro2 = new Metro("Metro Line 2");

        metro1.start();
        metro2.start();
    }
}
