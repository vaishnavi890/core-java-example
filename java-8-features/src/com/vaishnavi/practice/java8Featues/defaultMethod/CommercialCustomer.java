package com.vaishnavi.practice.java8Featues.defaultMethod;

public class CommercialCustomer implements LightBill{
    private String name;
    private int unitsConsumed;

    public CommercialCustomer(String name, int unitsConsumed) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    // Override default method to add a 10% surcharge for commercial users
    @Override
    public double calculateBill(int units) {
        double baseAmount = LightBill.super.calculateBill(units);
        return baseAmount + (baseAmount * 0.10); // Adding 10% surcharge
    }

    public void printBill() {
        System.out.println("Commercial Customer: " + name + ", Units Consumed: " + unitsConsumed +
                ", Total Bill (with surcharge): $" + calculateBill(unitsConsumed));
    }
}
