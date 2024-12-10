package com.vaishnavi.operator.relational;

import java.util.Scanner;

public class AttendanceCheck {
    //pseudocode
    //check student attendance
    public static void main(String[] args) {
        System.out.println("Enter the number and check your attendance!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=65){
            System.out.println("attendance is 65%");
        }
        else if(n<=87){
            System.out.println("Attendance is 87%");
        }
        else{
            System.out.println("Attendance is perfect");
        }
    }
}

