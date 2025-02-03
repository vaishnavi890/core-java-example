package com.vaishnavi.practice.oops.inheritance.singleInheritance;

import com.vaishnavi.practice.oops.inheritance.singleInheritance.service.SportsCar;

public class CarExample {
    public static void main(String[] args) {
        // Creating an object of SportsCar
        SportsCar myCar = new SportsCar("Ferrari", 320, "Enabled");

        // Calling methods from both superclass and subclass
        myCar.displayInfo();     // Inherited method
        myCar.showTurboMode();   // Subclass method
    }
}
