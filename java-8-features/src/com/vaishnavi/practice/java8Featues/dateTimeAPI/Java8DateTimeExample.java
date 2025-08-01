package com.vaishnavi.practice.java8Featues.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Java8DateTimeExample {
    public static void main(String[] args) {
        // 1. Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        // 2. Current Time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // 3. Current Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDateTime);

        // 4. Custom Date and Time
        LocalDate birthDate = LocalDate.of(2000, 5, 10);
        LocalTime birthTime = LocalTime.of(10, 30);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Birth Time: " + birthTime);

        // 5. Formatting Date and Time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = currentDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formatted);

        // 6. Adding/Subtracting Dates
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Next Week Date: " + nextWeek);

        LocalDate previousMonth = today.minusMonths(1);
        System.out.println("Previous Month Date: " + previousMonth);

        // 7. Difference Between Dates
        long daysBetween = ChronoUnit.DAYS.between(birthDate, today);
        System.out.println("Days Since Birth: " + daysBetween);
    }
}

