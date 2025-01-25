package com.vaishnavi.practice.exceptionHandling.customException;

public class NameNotProvidedException extends Exception {
    NameNotProvidedException(String msg) {
        super(msg);
    }
}

