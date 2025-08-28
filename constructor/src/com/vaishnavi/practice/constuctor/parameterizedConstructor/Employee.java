package com.vaishnavi.practice.constuctor.parameterizedConstructor;

public class Employee {
        int empId;
        String name;
        double basicSalary;

        // Parameterized Constructor
        Employee(int empId, String name, double basicSalary) {
            this.empId = empId;
            this.name = name;
            this.basicSalary = basicSalary;
        }

        // Calculate total salary with allowance
        double calculateSalary() {
            double hra = 0.20 * basicSalary;  // House Rent Allowance
            double da = 0.10 * basicSalary;  // Dearness Allowance
            return basicSalary + hra + da;
        }

        // Display employee details
        void displayEmployeeDetails() {
            System.out.println("Employee ID: " + empId);
            System.out.println("Name: " + name);
            System.out.println("Basic Salary: ₹" + basicSalary);
            System.out.println("Total Salary: ₹" + calculateSalary());
            System.out.println("---------------------------------");
        }

        public static void main(String[] args) {
            Employee e1 = new Employee(101, "Vaishnavi", 30000);
            Employee e2 = new Employee(102, "Aniket", 45000);

            e1.displayEmployeeDetails();
            e2.displayEmployeeDetails();
        }

}
