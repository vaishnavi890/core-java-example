package com.vaishnavi.practice.oops.inheritance.multilevelinheritance.service;

import com.vaishnavi.practice.oops.inheritance.multilevelinheritance.model.Transport;

public class TrainService extends Transport {
    int coaches;

    protected TrainService(String mode, int capacity) {
        super(mode, capacity);
    }

    void showTrainDetails() {
        displayTransportDetails();
        System.out.println("Number of Coaches: " + coaches);
    }
}

