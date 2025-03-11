package com.vaishnavi.practices.multithreading.scheduling;

public class GymClass {
    String name;
    String instructor;
    String day;
    String time;

    public GymClass(String name, String instructor, String day, String time) {
        this.name = name;
        this.instructor = instructor;
        this.day = day;
        this.time = time;
    }

    @Override
    public String toString() {
        return name + " by " + instructor + " on " + day + " at " + time;
    }
}
