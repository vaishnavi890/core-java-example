package com.vaishnavi.practices.multithreading.another;

public class MyThread extends Thread {
    @Override
    public void run() {
        // Code inside run() will execute in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
