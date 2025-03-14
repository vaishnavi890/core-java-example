package com.vaishnavi.practices.multithreading.interThreading.notifyAll;

public class Bus implements Runnable{
    private TravelStation station;

    public Bus(TravelStation station) {
        this.station = station;
    }

    @Override
    public void run() {
        station.busArrival();
    }
}
