package com.vaishnavi.practice.staticInjava.staticBlock;

public class AppConfig {
    static String appName;
    static String version;

    // Static block for initializing configuration
    static {
        System.out.println("Loading configuration...");
        appName = "Cab Booking System";
        version = "v1.0.5";
    }

    public static void main(String[] args) {
        System.out.println("Application Name: " + appName);
        System.out.println("Version: " + version);
    }
}
