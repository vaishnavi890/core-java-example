package com.vaishnavi.practice.java8Featues.collectionAPI.anotherExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TrainExample {
    public static void main(String[] args) {
        // Creating a List of Trains
        List<Train> trains = new ArrayList<>();
        trains.add(new Train(101, "Express A", "New York", "Chicago", 120.50));
        trains.add(new Train(202, "Express B", "Los Angeles", "San Francisco", 85.75));
        trains.add(new Train(303, "Express C", "Houston", "Dallas", 95.30));
        trains.add(new Train(404, "Express D", "Miami", "Orlando", 60.20));

        // Sorting Trains by Price (Ascending)
        Collections.sort(trains, Comparator.comparingDouble(Train::getPrice));

        System.out.println("\nTrains sorted by price:");
        trains.forEach(System.out::println);

        // Filtering trains with price > 90
        List<Train> expensiveTrains = trains.stream()
                .filter(train -> train.getPrice() > 90)
                .collect(Collectors.toList());

        System.out.println("\nTrains with price greater than 90:");
        expensiveTrains.forEach(System.out::println);

        // Searching for a train by Train Number
        int searchTrainNumber = 202;
        Train foundTrain = trains.stream()
                .filter(train -> train.getTrainNumber() == searchTrainNumber)
                .findFirst()
                .orElse(null);

        System.out.println("\nSearch result for Train Number " + searchTrainNumber + ": " + (foundTrain != null ? foundTrain : "Not Found"));
    }
}
