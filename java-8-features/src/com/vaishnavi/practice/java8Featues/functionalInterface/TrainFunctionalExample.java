package com.vaishnavi.practice.java8Featues.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import com.vaishnavi.practice.java8Featues.functionalInterface.model.Train;
import com.vaishnavi.practice.java8Featues.functionalInterface.model.TrainFilter;

public class TrainFunctionalExample {
    public static void main(String[] args) {
        // Creating a list of Train objects
        List<Train> trainList = new ArrayList<>();
        trainList.add(new Train("Express", 101, "New York", "Washington", 100.0));
        trainList.add(new Train("Superfast", 102, "Boston", "Chicago", 250.0));
        trainList.add(new Train("Local", 103, "San Francisco", "Los Angeles", 50.0));
        trainList.add(new Train("Bullet", 104, "Miami", "Orlando", 300.0));

        // Functional Interface Implementation using Lambda (Filter trains with fare > 100)
        TrainFilter expensiveTrainFilter = train -> train.getFare() > 100;

        // Filtering and displaying trains based on the functional interface
        System.out.println("Expensive Trains (Fare > 100):");
        trainList.forEach(train -> {
            if (expensiveTrainFilter.check(train)) {
                System.out.println(train);
            }
        });
    }
}
