package com.vaishnavi.practice.oops.inheritance.singleInheritance;

import com.vaishnavi.practice.oops.inheritance.singleInheritance.service.PassengerTrain;

public class TrainExample {
    public static void main(String[] args) {
        // Creating a PassengerTrain object
        PassengerTrain passengerTrain = new PassengerTrain("Intercity Express", 500, "Express");

        // Displaying the passenger train details
        passengerTrain.displayPassengerTrainDetails();

        // Starting the passenger train
        passengerTrain.start();
    }
}

