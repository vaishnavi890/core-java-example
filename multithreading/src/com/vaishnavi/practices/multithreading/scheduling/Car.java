package com.vaishnavi.practices.multithreading.scheduling;

public class Car {
    String carName;
    String driverName;
    String day;
    String time;

    public Car(String carName, String driverName, String day, String time) {
        this.carName = carName;
        this.driverName = driverName;
        this.day = day;
        this.time = time;
    }

    @Override
    public String toString() {
        return carName + " driven by " + driverName + " on " + day + " at " + time;
    }
}
