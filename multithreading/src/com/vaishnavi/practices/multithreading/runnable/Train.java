package com.vaishnavi.practices.multithreading.runnable;

public class Train implements Runnable{
    private String trainName;
    private int stations;

    public Train(String trainName, int stations) {
        this.trainName = trainName;
        this.stations = stations;
    }

    @Override
    public void run() {
        System.out.println(trainName + " train has started its journey.");
        for (int i = 1; i <= stations; i++) {
            System.out.println(trainName + " train reached station " + i);
            try {
                // Simulating time taken to reach the next station
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(trainName + " train was interrupted!");
            }
        }
        System.out.println(trainName + " train has completed its journey.");
    }

    public static void main(String[] args) {
        // Creating train objects
        Runnable train1 = new Train("Express", 5);
        Runnable train2 = new Train("Local", 3);
        Runnable train3 = new Train("Cargo", 4);

        // Creating and starting threads
        Thread thread1 = new Thread(train1);
        Thread thread2 = new Thread(train2);
        Thread thread3 = new Thread(train3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
