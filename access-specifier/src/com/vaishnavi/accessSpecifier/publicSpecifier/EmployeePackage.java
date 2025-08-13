package com.vaishnavi.accessSpecifier.publicSpecifier;

public class EmployeePackage {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Alice";         // allowed
        emp.employeeId = 101;       // allowed
        emp.displayInfo();          // allowed
    }
}
