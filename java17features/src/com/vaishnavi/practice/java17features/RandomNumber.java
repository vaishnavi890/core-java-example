package com.vaishnavi.practice.java17features;

import java.util.Random;
import java.util.Scanner;

    public class RandomNumber {
        private static final Scanner sc = new Scanner(System.in);
        private static final Random random = new Random();

        public static void main(String[] args) {

//        System.out.println("Enter id");
//        int id = Integer.parseInt(sc.nextLine());

            int id = randomValue();

            System.out.println("received id " + id);
        }

        private static int randomValue() {
            int id = random.nextInt(4);
            return (id > 0) ? id * (-1) : id;
        }
    }

