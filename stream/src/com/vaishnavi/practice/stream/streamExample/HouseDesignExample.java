package com.vaishnavi.practice.stream.streamExample;

import java.util.*;
import java.util.stream.Collectors;

public class HouseDesignExample {
    public static void main(String[] args) {
        List<House> houses = Arrays.asList(
                new House(1, "Modern Villa", 4, 2, 2500),
                new House(2, "Cottage", 3, 1, 1800),
                new House(3, "Bungalow", 2, 1, 1400),
                new House(4, "Penthouse", 5, 2, 3000),
                new House(5, "Mansion", 7, 3, 5000)
        );

        // 1. Filter houses with more than 3 rooms
        List<House> largeHouses = houses.stream()
                .filter(house -> house.getRooms() > 3)
                .collect(Collectors.toList());

        // 2. Sort houses by area size
        List<House> sortedByArea = houses.stream()
                .sorted(Comparator.comparingDouble(House::getArea))
                .collect(Collectors.toList());

        // 3. Get a list of house designs
        List<String> houseDesigns = houses.stream()
                .map(House::getDesign)
                .collect(Collectors.toList());

        // 4. Group houses by number of floors
        Map<Integer, List<House>> groupedByFloors = houses.stream()
                .collect(Collectors.groupingBy(House::getFloors));

        // Output results
        System.out.println("Houses with More Than 3 Rooms: " + largeHouses);
        System.out.println("\nSorted Houses by Area: " + sortedByArea);
        System.out.println("\nHouse Designs: " + houseDesigns);
        System.out.println("\nHouses Grouped by Floors: " + groupedByFloors);
    }
}
