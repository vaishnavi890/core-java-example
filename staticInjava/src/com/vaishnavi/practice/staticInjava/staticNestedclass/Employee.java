package com.vaishnavi.practice.staticInjava.staticNestedclass;

public class Employee {

    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Static nested class
    public static class Address {
        private String city;
        private String state;
        private String pincode;

        public Address(String city, String state, String pincode) {
            this.city = city;
            this.state = state;
            this.pincode = pincode;
        }

        public void displayAddress() {
            System.out.println("City: " + city);
            System.out.println("State: " + state);
            System.out.println("Pincode: " + pincode);
        }
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }

    // Main method
    public static void main(String[] args) {
        // Outer class object
        Employee emp = new Employee(101, "Vaishnavi");

        // Static nested class object (can be created without outer object)
        Employee.Address address = new Employee.Address("Pune", "Maharashtra", "411001");

        // Display employee and address info
        emp.displayEmployee();
        System.out.println("Address Details:");
        address.displayAddress();
    }
}


