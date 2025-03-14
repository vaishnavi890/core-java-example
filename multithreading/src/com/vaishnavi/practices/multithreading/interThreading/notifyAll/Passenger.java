package com.vaishnavi.practices.multithreading.interThreading.notifyAll;

public class Passenger implements Runnable{
    private TravelStation station;
    private String passengerName;

    public Passenger(TravelStation station, String passengerName) {
        this.station = station;
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        station.waitForBus(passengerName);
    }
}
