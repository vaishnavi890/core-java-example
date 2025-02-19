package com.vaishnavi.practice.java8Featues.nioPackage;

import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.List;

public class TrainReservation {
    private static final String FILE_PATH = "train_reservations.txt";

    // Book a train ticket
    public static void bookTicket(int ticketId, String passengerName, String trainName, LocalDate travelDate) {
        String record = ticketId + "," + passengerName + "," + trainName + "," + travelDate + ",Booked\n";
        try {
            // Append new booking record
            Files.write(Paths.get(FILE_PATH), record.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Ticket booked for: " + passengerName);
        } catch (IOException e) {
            System.err.println("Error writing booking: " + e.getMessage());
        }
    }

    // Read all train reservations
    public static void readReservations() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH), StandardCharsets.UTF_8);
            System.out.println("\n--- Train Reservations ---");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading reservations: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Book train tickets
        bookTicket(201, "Yogita", "Express Train", LocalDate.of(2025, 3, 10));
        bookTicket(202, "Supriya", "Superfast Express", LocalDate.of(2025, 3, 15));

        // Read and display reservations
        readReservations();
    }
}
