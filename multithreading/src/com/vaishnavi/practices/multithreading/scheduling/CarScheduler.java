package com.vaishnavi.practices.multithreading.scheduling;

import java.util.ArrayList;
import java.util.Scanner;

public class CarScheduler {
    private static ArrayList<Car> schedules = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nCar Scheduling System");
            System.out.println("1. Add Schedule");
            System.out.println("2. Show Schedules");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addSchedule();
                case 2 -> showSchedules();
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }

    private static void addSchedule() {
        System.out.print("Car Name: ");
        String carName = scanner.nextLine();
        System.out.print("Driver Name: ");
        String driverName = scanner.nextLine();
        System.out.print("Day: ");
        String day = scanner.nextLine();
        System.out.print("Time: ");
        String time = scanner.nextLine();

        Car schedule = new Car(carName, driverName, day, time);
        schedules.add(schedule);
        System.out.println("Schedule added: " + schedule);
    }

    private static void showSchedules() {
        System.out.println("\nCar Schedules:");
        if (schedules.isEmpty()) {
            System.out.println("No schedules available.");
        } else {
            for (Car schedule : schedules) {
                System.out.println(schedule);
            }
        }
    }
}
