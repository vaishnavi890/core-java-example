package com.vaishnavi.practice.exceptionHandling.exception;

public class FoodNotAvailableException extends Exception {
    public FoodNotAvailableException(String message) {
        super(message);
    }
}
