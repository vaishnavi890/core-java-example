package com.vaishnavi.practice.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Todays date is " + today);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("todays time and date is " + currentDateTime);

    }
}

