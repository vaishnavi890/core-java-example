package com.vaishnavi.practice.java8Featues.functionalInterface.model;

@FunctionalInterface
public interface TrainFilter {
    boolean check(Train train);
}
