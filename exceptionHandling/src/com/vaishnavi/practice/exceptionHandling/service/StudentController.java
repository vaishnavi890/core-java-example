package com.vaishnavi.practice.exceptionHandling.service;

import com.vaishnavi.practice.exceptionHandling.customException.InvalidMarkException;

public class StudentController {
    private final StudentService studentService = new StudentService();

    public void addMarks() {
        try {
            studentService.addMarks();
        } catch (InvalidMarkException invalidMarkException) {
            System.err.println(invalidMarkException.getMessage());
        } finally {
            System.out.println("finally block executed..");
        }
    }
}

