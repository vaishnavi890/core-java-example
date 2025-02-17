package com.vaishnavi.practice.java8Featues.forEachMethod;

import java.util.Arrays;
import java.util.List;

public class SquareExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using forEach with a lambda expression to print the square of each number
        numbers.forEach(num -> System.out.println("Square of " + num + " is: " + (num * num)));
    }
}

