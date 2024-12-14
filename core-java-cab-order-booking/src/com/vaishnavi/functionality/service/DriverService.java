package com.vaishnavi.functionality.service;

import com.vaishnavi.functionality.model.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverService {
    private List<Driver> driverList = new ArrayList<>();

    public void registerDriver(Driver driver) {
        driverList.add(driver);
        System.out.println("Driver registered successfully: " + driver);
    }

    public void viewDrivers() {
        if (driverList.isEmpty()) {
            System.out.println("No drivers found.");
        } else {
            System.out.println("Registered Drivers:");
            for (Driver driver : driverList) {
                System.out.println(driver);
            }
        }
    }
}

