package com.vaishnavi.practice.strings.subString;

public class SubstringExample1 {
    public static void main(String[] args) {
        String fullName = "Vaishnavi Chewale";

        // Extract first name
        String firstName = fullName.substring(0, fullName.indexOf(' '));

        // Extract last name
        String lastName = fullName.substring(fullName.indexOf(' ') + 1);

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}
