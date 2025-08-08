package com.vaishnavi.practice.staticInjava.staticMethod;

public class SwitchBoard {

    // Static method to turn a switch ON
    public static void turnOn(String appliance) {
        System.out.println(appliance + " is now ON.");
    }

    // Static method to turn a switch OFF
    public static void turnOff(String appliance) {
        System.out.println(appliance + " is now OFF.");
    }

    public static void main(String[] args) {
        System.out.println("=== Switchboard Control System ===");

        // No object needed to call static methods
        SwitchBoard.turnOn("Fan");
        SwitchBoard.turnOn("Light");
        SwitchBoard.turnOff("Fan");
        SwitchBoard.turnOn("TV");
        SwitchBoard.turnOff("Light");
    }
}

