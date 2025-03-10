package com.vaishnavi.practices.multithreading.thread;

public class TrainExample {
    public static void main(String[] args) {
        Train train1 = new Train("Express 101");
        Train train2 = new Train("Local 202");
        Train train3 = new Train("Cargo 303");

        // Starting the trains (threads)
        train1.start();
        train2.start();
        train3.start();
    }
}
