package com.vaishnavi.practice.exceptionHandling.customException;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}
