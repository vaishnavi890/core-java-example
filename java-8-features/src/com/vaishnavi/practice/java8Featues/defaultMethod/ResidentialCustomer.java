package com.vaishnavi.practice.java8Featues.defaultMethod;

public class ResidentialCustomer implements LightBill{
    private String name;
    private int unitsConsumed;

    public ResidentialCustomer(String name, int unitsConsumed) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    public void printBill() {
        System.out.println("Customer: " + name + ", Units Consumed: " + unitsConsumed +
                ", Total Bill: $" + calculateBill(unitsConsumed));
    }
}
