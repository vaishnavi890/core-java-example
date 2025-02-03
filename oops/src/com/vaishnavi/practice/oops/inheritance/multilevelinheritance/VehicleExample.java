package com.vaishnavi.practice.oops.inheritance.multilevelinheritance;

import com.vaishnavi.practice.oops.inheritance.multilevelinheritance.service.SedanService;

public class VehicleExample {
    public static void main(String[] args) {
        SedanService sedan = new SedanService("Toyota", 180, 4, "Camry");
        sedan.showSedanDetails();
    }
}
