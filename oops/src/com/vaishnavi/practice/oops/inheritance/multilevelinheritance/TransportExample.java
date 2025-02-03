package com.vaishnavi.practice.oops.inheritance.multilevelinheritance;

import com.vaishnavi.practice.oops.inheritance.multilevelinheritance.service.ExpressTrain;

public class TransportExample {
    public static void main(String[] args) {
        ExpressTrain express = new ExpressTrain("Rail", 1000, 12, 150);
        express.showExpressTrainDetails();
    }
}

