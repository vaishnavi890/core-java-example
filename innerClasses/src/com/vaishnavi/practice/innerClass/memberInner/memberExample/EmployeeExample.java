package com.vaishnavi.practice.innerClass.memberInner.memberExample;

public class EmployeeExample {
    public static void main(String[] args) {
        // Creating an outer class (Employee) object
        Employee emp = new Employee("Vaishnavi Chevale", 101);

        // Creating an inner class (Address) object using the outer class object
        Employee.Address address = emp.new Address("Pune", "India");

        // Display Employee Address Details
        address.displayAddress();
    }
}

