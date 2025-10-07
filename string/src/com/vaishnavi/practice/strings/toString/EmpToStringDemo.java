package com.vaishnavi.practice.strings.toString;

public class EmpToStringDemo {
    int empId;
    String name;
    String city;
    String Address;

    EmpToStringDemo(int empId, String name, String city, String Address) {
        this.Address = Address;
        this.empId = empId;
        this.city = city;
        this.name = name;
    }

    public static void main(String[] args) {
        EmpToStringDemo empToStringDemo = new EmpToStringDemo(101, " Shreya ", "Mumbai ", "Aroli");
        System.out.println(empToStringDemo);
    }

    public String toString() {
        return empId + name + city + Address;
    }

}
