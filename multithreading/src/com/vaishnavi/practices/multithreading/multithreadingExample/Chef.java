package com.vaishnavi.practices.multithreading.multithreadingExample;

public class Chef extends Thread {
    private String dish;

    public Chef(String dish) {
        this.dish = dish;
    }

    @Override
    public void run() {
        System.out.println("Chef started cooking: " + dish);
        try {
            Thread.sleep(2000); // simulate cooking time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Chef finished cooking: " + dish);
    }
}
