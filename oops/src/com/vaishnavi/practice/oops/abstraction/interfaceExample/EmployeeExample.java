package com.vaishnavi.practice.oops.abstraction.interfaceExample;

public class EmployeeExample {
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee(50000);
        Employee partTimeEmp = new PartTimeEmployee(20, 80);

        fullTimeEmp.work();
        System.out.println("Full-time Employee Salary: $" + fullTimeEmp.getSalary());

        partTimeEmp.work();
        System.out.println("Part-time Employee Salary: $" + partTimeEmp.getSalary());
    }
}
