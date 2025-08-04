package com.vaishnavi.practice.staticClass.memberInner;

public class Employee {
    private String employeeName = "Vaishnavi";
    private int employeeId = 101;

    // Member Inner Class (non-static)
    class Department {
        private String deptName = "Software Development";

        public void showDetails() {
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Department: " + deptName);
        }
    }

    public static void main(String[] args) {
        // Create outer class object
        Employee emp = new Employee();

        // Create inner class object using outer object
        Employee.Department dept = emp.new Department();
        dept.showDetails();
    }
}
