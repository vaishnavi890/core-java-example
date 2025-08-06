package com.vaishnavi.practice.staticInjava.staticMethod;

public class Counter {
        static int count = 0;  // static variable

        // Static method to increase count
        public static void increment() {
            count++;
        }

        public static void main(String[] args) {
            Counter.increment();
            Counter.increment();
            System.out.println("Count: " + Counter.count);  // Output: Count: 2
        }
    }


