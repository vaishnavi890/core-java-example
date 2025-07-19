package com.vaishnavi.practice.dateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date is " + date);

        DateFormat format = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss.SSS");
        String dateInString = format.format(date);
        System.out.println("Formatted date " + dateInString);
    }
}

