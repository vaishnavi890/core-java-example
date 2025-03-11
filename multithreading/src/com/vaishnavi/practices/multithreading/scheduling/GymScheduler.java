package com.vaishnavi.practices.multithreading.scheduling;

import java.util.ArrayList;
import java.util.Scanner;


public class GymScheduler {
    private static ArrayList<GymClass> classes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nGym Scheduling System");
            System.out.println("1. Add Class");
            System.out.println("2. Show Schedule");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addClass();
                case 2 -> showSchedule();
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }

    private static void addClass() {
        System.out.print("Class Name: ");
        String name = scanner.nextLine();
        System.out.print("Instructor: ");
        String instructor = scanner.nextLine();
        System.out.print("Day: ");
        String day = scanner.nextLine();
        System.out.print("Time: ");
        String time = scanner.nextLine();

        GymClass gymClass = new GymClass(name, instructor, day, time);
        classes.add(gymClass);
        System.out.println("Class added: " + gymClass);
    }

    private static void showSchedule() {
        System.out.println("\nGym Schedule:");
        for (GymClass gymClass : classes) {
            System.out.println(gymClass);
        }
        if (classes.isEmpty()) {
            System.out.println("No classes scheduled.");
        }
    }
}
