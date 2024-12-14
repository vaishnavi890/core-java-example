package com.vaishnavi.functionality.service;

import com.vaishnavi.functionality.model.Ride;

import java.util.ArrayList;
import java.util.List;

public class RideService {
    private List<Ride> rideList = new ArrayList<>();

    public void createRide(Ride ride) {
        rideList.add(ride);
        System.out.println("Ride created successfully: " + ride);
    }

    public void viewRides() {
        if (rideList.isEmpty()) {
            System.out.println("No rides found.");
        } else {
            System.out.println("Available Rides:");
            for (Ride ride : rideList) {
                System.out.println(ride);
            }
        }
    }
}

