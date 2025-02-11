package com.vaishnavi.practice.innerClass.memberInner.memberExample;

public class Employee {
    private String name;
    private int empId;

    // Constructor
    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Member Inner Class
    class Address {
        private String city;
        private String country;

        // Constructor for Address
        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }

        void displayAddress() {
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + name);
            System.out.println("City: " + city);
            System.out.println("Country: " + country);
        }
    }
}


