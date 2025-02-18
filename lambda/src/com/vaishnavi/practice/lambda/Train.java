package com.vaishnavi.practice.lambda;

public class Train {
    private String name;
    private TrainAction action; // Behavior assigned via lambda

    // Constructor
    public Train(String name, TrainAction action) {
        this.name = name;
        this.action = action;
    }

    // Execute the assigned action
    public void run() {
        System.out.print(name + " is running: ");
        action.operate();
    }
}

