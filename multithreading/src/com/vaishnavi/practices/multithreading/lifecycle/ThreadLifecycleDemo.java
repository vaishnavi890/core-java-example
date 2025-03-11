package com.vaishnavi.practices.multithreading.lifecycle;

public class ThreadLifecycleDemo implements Runnable{
    public static Thread whiteThread;
    public static ThreadLifecycleDemo threadLifecycleDemo;

    public static void main(String[] args) {
        threadLifecycleDemo = new ThreadLifecycleDemo();
        whiteThread = new Thread(threadLifecycleDemo);

        // whiteThread created and is currently in the NEW state.
        System.out.println("State of whiteThread after creating it - " + whiteThread.getState());
        whiteThread.start();

        // whiteThread moved to Runnable state
        System.out.println("State of whiteThread after calling .start() method on it - " + whiteThread.getState());
    }

    public void run() {
        BlueThread blueThread = new BlueThread();
        Thread lightBlueThread = new Thread(blueThread);

        // lightBlueThread created and is currently in the NEW state.
        System.out.println("State of lightBlueThread after creating it - " + lightBlueThread.getState());
        lightBlueThread.start();

        // lightBlueThread moved to Runnable state
        System.out.println("State of lightBlueThread after calling .start() method on it - " + lightBlueThread.getState());

        // moving whiteThread to timed waiting state
        try {
            // moving thread1 to timed waiting state
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of lightBlueThread after calling .sleep() method on it - " + lightBlueThread.getState());

        try {
            // waiting for lightBlueThread to die
            lightBlueThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of lightBlueThread when it has finished it's execution - " + lightBlueThread.getState());
    }
}
