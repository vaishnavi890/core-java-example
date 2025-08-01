package com.vaishnavi.practice.java8Featues.dateTimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class SensorDataLogger {
    public static void main(String[] args) {

        // Simulate 5 sensor readings
        for (int i = 1; i <= 5; i++) {
            logSensorData(i);
            try {
                Thread.sleep(1000); // Simulate 1-second interval
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to simulate sensor data logging
    public static void logSensorData(int readingNumber) {
        // Get current timestamp
        LocalDateTime timestamp = LocalDateTime.now();

        // Format timestamp
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Simulate temperature value
        double temperature = new Random().nextDouble() * 40; // Between 0 and 40°C

        // Display the sensor reading
        System.out.println("Reading " + readingNumber + ":");
        System.out.println("Timestamp : " + timestamp.format(formatter));
        System.out.printf("Temperature: %.2f°C\n", temperature);
        System.out.println("-------------------------");
    }
}


