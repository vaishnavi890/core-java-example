package com.vaishnavi.practices.multithreading.lock;

public class LaptopClassLevelLockExample extends Thread{
    private String laptopName;

    public LaptopClassLevelLockExample(String laptopName) {
        this.laptopName = laptopName;
    }

    // Class-level synchronized method
    public static synchronized void performMaintenance(String laptopName) {
        System.out.println(laptopName + " is under maintenance...");
        try {
            Thread.sleep(1000);  // Simulate maintenance time
        } catch (InterruptedException e) {
            System.out.println("Maintenance interrupted for " + laptopName);
        }
        System.out.println(laptopName + " maintenance completed.");
    }

    @Override
    public void run() {
        performMaintenance(laptopName);
    }

    public static void main(String[] args) {
        // Creating multiple laptop threads
        LaptopClassLevelLockExample laptop1 = new LaptopClassLevelLockExample("Dell Inspiron");
        LaptopClassLevelLockExample laptop2 = new LaptopClassLevelLockExample("HP Pavilion");
        LaptopClassLevelLockExample laptop3 = new LaptopClassLevelLockExample("Lenovo ThinkPad");

        // Starting the threads
        laptop1.start();
        laptop2.start();
        laptop3.start();
    }

}
