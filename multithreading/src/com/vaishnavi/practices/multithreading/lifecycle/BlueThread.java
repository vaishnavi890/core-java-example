package com.vaishnavi.practices.multithreading.lifecycle;

public class BlueThread implements Runnable{
    public void run() {
        // moving thread2 to timed waiting state
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of whiteThread while it called join() method on lightBlueThread - " + ThreadLifecycleDemo.whiteThread.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
