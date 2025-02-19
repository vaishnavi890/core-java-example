package com.vaishnavi.practice.java8Featues.nioPackage;

import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.List;

public class EmployeeAttendance {
    private static final String FILE_PATH = "attendance_records.txt";

    // Mark attendance for an employee
    public static void markAttendance(int employeeId, String employeeName) {
        String record = employeeId + "," + employeeName + "," + LocalDate.now() + ",Present\n";
        try {
            // Append new attendance record
            Files.write(Paths.get(FILE_PATH), record.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Attendance marked for: " + employeeName);
        } catch (IOException e) {
            System.err.println("Error writing attendance: " + e.getMessage());
        }
    }

    // Read attendance records
    public static void readAttendance() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH), StandardCharsets.UTF_8);
            System.out.println("\n--- Employee Attendance Records ---");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading attendance: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Mark attendance for employees
        markAttendance(101, "Saurabh");
        markAttendance(102, "Chandrakala");

        // Read and display attendance records
        readAttendance();
    }
}
