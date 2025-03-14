package com.vaishnavi.practices.multithreading.runnable;

public class Animal implements Runnable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running... Step " + i);
            try {
                Thread.sleep(500); // Simulate some delay
            } catch (InterruptedException e) {
                System.err.println(name + " was interrupted!");
            }
        }
        System.out.println(name + " has finished running!");
    }

    public static void main(String[] args) {
        Animal rabbit = new Animal("Rabbit");
        Animal turtle = new Animal("Turtle");

        Thread rabbitThread = new Thread(rabbit);
        Thread turtleThread = new Thread(turtle);

        rabbitThread.start();
        turtleThread.start();
    }
}
