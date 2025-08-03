package com.vaishnavi.practice.staticClass.memberInner;

public class Company {
    //  Static nested class
    static class BonusCalculator {
        static double getBonusPercentage(String designation) {
            switch (designation) {
                case "Manager":
                    return 0.20;
                case "Developer":
                    return 0.15;
                case "Intern":
                    return 0.05;
                default:
                    return 0.10;
            }
        }
    }

    // ✅ Member inner class (non-static)
    class Employee {
        String name;
        String designation;
        double salary;

        Employee(String name, String designation, double salary) {
            this.name = name;
            this.designation = designation;
            this.salary = salary;
        }

        void displaySalaryWithBonus() {
            double bonusRate = BonusCalculator.getBonusPercentage(designation);
            double bonus = salary * bonusRate;
            double totalSalary = salary + bonus;

            System.out.println("Employee Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Base Salary: ₹" + salary);
            System.out.println("Bonus: ₹" + bonus);
            System.out.println("Total Salary (with Bonus): ₹" + totalSalary);
            System.out.println("--------------------------------------");
        }
    }

    public static void main(String[] args) {
        Company company = new Company();

        Company.Employee emp1 = company.new Employee("Vaishnavi", "Developer", 50000);
        Company.Employee emp2 = company.new Employee("Rohan", "Manager", 80000);

        emp1.displaySalaryWithBonus();
        emp2.displaySalaryWithBonus();
    }
}