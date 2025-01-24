package com.vaishnavi.practice.exceptionHandling;

import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int availableTickets = 10;

        try {
            System.out.print("Enter the number of tickets you want to book: ");
            int ticketsToBook = scanner.nextInt();

            if (ticketsToBook <= 0) {
                throw new IllegalArgumentException("Number of tickets must be positive.");
            }

            if (ticketsToBook > availableTickets) {
                throw new Exception("Not enough tickets available.");
            }

            availableTickets -= ticketsToBook;
            System.out.println("Successfully booked " + ticketsToBook + " tickets.");
            System.out.println("Tickets remaining: " + availableTickets);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Thank you for using the ticket booking system.");
        }
    }
}
