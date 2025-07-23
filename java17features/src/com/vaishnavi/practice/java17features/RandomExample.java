package com.vaishnavi.practice.java17features;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomExample {
    public static void main(String[] args) {
        RandomGenerator rand = RandomGeneratorFactory.of("L64X128MixRandom").create();
        System.out.println(rand.nextInt(100)); // random number 0–99
    }
}


