package com.vaishnavi.practice.dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ATMMachineDateTime {

    private static double balance = 5000.00; // initial balance

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ATM MACHINE =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // log current date-time
            LocalDateTime now = LocalDateTime.now();
            String timestamp = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

            switch (choice) {
                case 1:
                    System.out.println("[" + timestamp + "] Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("[" + timestamp + "] Withdrawal of ₹" + withdrawAmount + " successful.");
                    } else {
                        System.out.println("[" + timestamp + "] Insufficient balance or invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("[" + timestamp + "] Deposit of ₹" + depositAmount + " successful.");
                    } else {
                        System.out.println("[" + timestamp + "] Invalid deposit amount.");
                    }
                    break;

                case 4:
                    System.out.println("[" + timestamp + "] Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("[" + timestamp + "] Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}


