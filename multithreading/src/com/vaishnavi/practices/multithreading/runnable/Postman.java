package com.vaishnavi.practices.multithreading.runnable;

public class Postman implements Runnable{
    private String name;

    public Postman(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is delivering package " + i);
            try {
                Thread.sleep(1000); // Simulate delivery time
            } catch (InterruptedException e) {
                System.err.println(name + " was interrupted!");
            }
        }
        System.out.println(name + " has completed all deliveries!");
    }
    public static void main(String[] args) {
        Postman john = new Postman("John");
        Postman alice = new Postman("Alice");

        Thread postmanJohn = new Thread(john);
        Thread postmanAlice = new Thread(alice);

        postmanJohn.start();
        postmanAlice.start();
    }
}
