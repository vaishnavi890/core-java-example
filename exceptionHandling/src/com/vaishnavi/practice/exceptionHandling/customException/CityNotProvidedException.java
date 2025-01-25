package com.vaishnavi.practice.exceptionHandling.customException;

public class CityNotProvidedException extends Exception {
    CityNotProvidedException(String msg) {
        super(msg);
    }
}
