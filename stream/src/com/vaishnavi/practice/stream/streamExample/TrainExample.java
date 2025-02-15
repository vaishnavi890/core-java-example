package com.vaishnavi.practice.stream.streamExample;

import java.util.*;
import java.util.stream.Collectors;

public class TrainExample {
    public static void main(String[] args) {
        // Using ArrayList to store train data
        List<Train> trainList = new ArrayList<>(Arrays.asList(
                new Train(101, "Express 1", "Delhi", "Mumbai", 1500, 10),
                new Train(102, "Express 2", "Delhi", "Pune", 1200, 5),
                new Train(103, "Superfast", "Mumbai", "Chennai", 2000, 0),
                new Train(104, "Rajdhani", "Delhi", "Mumbai", 3000, 8),
                new Train(105, "Shatabdi", "Delhi", "Chennai", 2500, 20)
        ));

        // Using Set to store unique routes
        Set<String> routes = trainList.stream()
                .map(train -> train.getSource() + " -> " + train.getDestination())
                .collect(Collectors.toSet());

        System.out.println("Available Routes: " + routes);

        // Using Map to store train details with trainId as key
        Map<Integer, Train> trainMap = trainList.stream()
                .collect(Collectors.toMap(Train::getTrainId, train -> train));

        System.out.println("\nTrain Map:");
        trainMap.forEach((id, train) -> System.out.println("Train ID: " + id + " => " + train));

        // Filtering trains from Delhi to Mumbai with available seats
        List<Train> availableTrains = trainList.stream()
                .filter(train -> train.getSource().equalsIgnoreCase("Delhi") &&
                        train.getDestination().equalsIgnoreCase("Mumbai") &&
                        train.getSeatsAvailable() > 0)
                .sorted(Comparator.comparingDouble(Train::getFare))
                .collect(Collectors.toList());

        System.out.println("\nAvailable Trains (Delhi -> Mumbai):");
        availableTrains.forEach(System.out::println);

        // Using Iterator to traverse through the train list
        System.out.println("\nAll Trains:");
        Iterator<Train> trainIterator = trainList.iterator();
        while (trainIterator.hasNext()) {
            System.out.println(trainIterator.next());
        }
    }
}

