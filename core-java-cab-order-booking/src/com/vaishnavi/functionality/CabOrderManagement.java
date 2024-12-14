package com.vaishnavi.functionality;

import com.vaishnavi.functionality.service.*;
import com.vaishnavi.functionality.model.*;

import java.util.Scanner;

public class CabOrderManagement {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Services
        UserService userService = new UserService();
        DriverService driverService = new DriverService();
        RideService rideService = new RideService();
        PaymentService paymentService = new PaymentService();

        int mainChoice;
        do {
            System.out.println("\n--- Cab Order Management System ---");
            System.out.println("1. User Management");
            System.out.println("2. Driver Management");
            System.out.println("3. Ride Management");
            System.out.println("4. Payment Management");
            System.out.println("5. Ratings Management");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    userManagement(userService, scanner);
                    break;
                case 2:
                    driverManagement(driverService, scanner);
                    break;
                case 3:
                    rideManagement(rideService, scanner);
                    break;
                case 4:
                    paymentManagement(paymentService, scanner);
                    break;
                case 5:
                    ratingsManagement(scanner); // Add functionality if needed
                    break;
                case 6:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (mainChoice != 6);

        scanner.close();
    }

    // User Management Menu
    private static void userManagement(UserService userService, Scanner scanner) {
        int userChoice;
        do {
            System.out.println("\n--- User Management ---");
            System.out.println("1. Register User");
            System.out.println("2. View Registered Users");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();

                    User user = new User(userId, name, email, phone);
                    userService.registerUser(user);
                    break;
                case 2:
                    userService.viewUsers();
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (userChoice != 3);
    }

    // Driver Management Menu
    private static void driverManagement(DriverService driverService, Scanner scanner) {
        int driverChoice;
        do {
            System.out.println("\n--- Driver Management ---");
            System.out.println("1. Register Driver");
            System.out.println("2. View Registered Drivers");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            driverChoice = scanner.nextInt();

            switch (driverChoice) {
                case 1:
                    System.out.print("Enter Driver ID: ");
                    int Id = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Cab Details: ");
                    //String cabDetails = scanner.nextLine();

                    Driver driver = new Driver(driverId, name, email, phone);
                    driverService.registerDriver(driver);
                    break;
                case 2:
                    driverService.viewDrivers();
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (driverChoice != 3);
    }

    // Ride Management Menu
    private static void rideManagement(RideService rideService, Scanner scanner) {
        int rideChoice;
        do {
            System.out.println("\n--- Ride Management ---");
            System.out.println("1. Create Ride");
            System.out.println("2. View All Rides");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            rideChoice = scanner.nextInt();

            switch (rideChoice) {
                case 1:
                    System.out.print("Enter Ride ID: ");
                    int Id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    System.out.print("Enter Driver ID: ");
                    int driverId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Pickup Location: ");
                    String pickupLocation = scanner.nextLine();
                    System.out.print("Enter Dropoff Location: ");
                    String dropoffLocation = scanner.nextLine();
                    System.out.print("Enter Fare: ");
                    double fare = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Status: ");
                    //String status = scanner.nextLine();

                    Ride ride = new Ride(rideId, userId, driverId, pickupLocation, dropoffLocation, fare);
                    rideService.createRide(ride);
                    break;
                case 2:
                    rideService.viewRides();
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (rideChoice != 3);
    }

    // Payment Management Menu
    private static void paymentManagement(PaymentService paymentService, Scanner scanner) {
        int paymentChoice;
        do {
            System.out.println("\n--- Payment Management ---");
            System.out.println("1. Process Payment");
            System.out.println("2. View All Payments");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            paymentChoice = scanner.nextInt();

            switch (paymentChoice) {
                case 1:
                    System.out.print("Enter Payment ID: ");
                    int Id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Ride ID: ");
                    int rideId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Payment Method: ");
                    String paymentMethod = scanner.nextLine();
                    System.out.print("Enter Status: ");
                    //String status = scanner.nextLine();

                    Payment payment = new Payment(paymentId, rideId, userId, amount, paymentMethod);
                    paymentService.processPayment(payment);
                    break;
                case 2:
                    paymentService.viewPayments();
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (paymentChoice != 3);
    }

    // Ratings Management Menu (Placeholder)
    private static void ratingsManagement(Scanner scanner) {
        CabOrderManagement.scanner = scanner;
        System.out.println("\n--- Ratings Management ---");
        System.out.println("Feature under construction!");
    }
}

