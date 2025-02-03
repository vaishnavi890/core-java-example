package com.vaishnavi.practice.oops.inheritance.multilevelinheritance.service;

import com.vaishnavi.practice.oops.inheritance.singleInheritance.model.Train;

public class ExpressTrain extends Train {
    int speed;

    public ExpressTrain(String mode, int capacity, int coaches, int speed) {
        super(mode, capacity);
        this.speed = speed;
    }

    public void showExpressTrainDetails() {
        showTrainDetails();
        System.out.println("Maximum Speed: " + speed + " km/h");
    }

    private void showTrainDetails() {
    }
}

