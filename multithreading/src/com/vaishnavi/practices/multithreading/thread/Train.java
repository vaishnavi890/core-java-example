package com.vaishnavi.practices.multithreading.thread;

public class Train extends Thread {
    private String trainName;

    public Train(String trainName) {
        this.trainName = trainName;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(trainName + " is at station " + i);
                // Simulate time taken to reach the next station
                Thread.sleep(2000);
            }
            System.out.println(trainName + " has reached its destination.");
        } catch (InterruptedException e) {
            System.out.println(trainName + " was interrupted.");
        }
    }
}
