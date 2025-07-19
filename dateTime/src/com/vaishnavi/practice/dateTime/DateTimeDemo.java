package com.vaishnavi.practice.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        //current date
        LocalDate todayDate = LocalDate.now();
        System.out.println("Todays Date is " + todayDate);

        LocalDateTime todayTime = LocalDateTime.now();
        System.out.println("todays time is " + todayTime);
        LocalDateTime oneMinitLaterDateTime = todayTime.plusMinutes(1);
        System.out.println("After 1 minute date will be " + oneMinitLaterDateTime);

        //add 1 month to current date
        LocalDate onemonthLaterDate = todayDate.plusMonths(1);
        System.out.println("After 1 month date will be :" + onemonthLaterDate);

        LocalDate twentyEightDayAgoDate = todayDate.minusDays(28);
        System.out.println("28 days ago date was " + twentyEightDayAgoDate);
    }
}

