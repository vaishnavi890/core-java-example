package com.vaishnavi.practice.array;

import java.util.Scanner;

public class BowlingSpeedExample {
    public static void main(String[] args) {
        // Create an array to store the speeds of 6 balls in an over
        double[] bowlingSpeeds = new double[6];

        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the bowling speeds for each ball in the over
        System.out.println("Enter the bowling speeds for 6 balls in an over:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter speed for ball " + (i + 1) + " (in km/h): ");
            bowlingSpeeds[i] = scanner.nextDouble();
        }
        // Display the bowling speeds of the over
        System.out.println("\nBowling speeds in the over are:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Ball " + (i + 1) + ": " + bowlingSpeeds[i] + " km/h");
        }
        // Optionally, you can also calculate the average speed or perform other operations
        double totalSpeed = 0;
        for (double speed : bowlingSpeeds) {
            totalSpeed += speed;
        }
        double averageSpeed = totalSpeed / 6;
        System.out.println("\nAverage Bowling Speed: " + averageSpeed + " km/h");

        scanner.close();
    }
}
