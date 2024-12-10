package com.vaishnavi.accessSpecifier;

import com.vaishnavi.accessSpecifier.defaultSpecifier.City;
import com.vaishnavi.accessSpecifier.privateSpecifier.Vehicle;
import com.vaishnavi.accessSpecifier.protectedSpecifier.Building;
import com.vaishnavi.accessSpecifier.publicSpecifier.Student;

public class SpecifierDemo {
    public static void main(String[] args) {
        SpecifierDemo specifierDemo = new SpecifierDemo();
        specifierDemo.publicSpecifierDemo();

        specifierDemo.privateSpecifierDemo();

        specifierDemo.protectedSpecifierDemo();

        specifierDemo.defaultSpecifierDemo();
    }

    void publicSpecifierDemo() {
        Student student = new Student();
        student.id = 1;
        student.name = "komal";
        student.city = "pune";

        System.out.println("Student = " + student);
    }

    void privateSpecifierDemo() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1);
        vehicle.setMake("Mahindra");
        vehicle.setModel("xuv500");
        System.out.println("Vehicle=" + vehicle);
    }

    void protectedSpecifierDemo() {
        Building building = new Building();
        building.setId(1);
        building.setName("ABC Building");
        building.setCity("pune");
        System.out.println("Building=" + building);
    }

    void defaultSpecifierDemo() {
        City city = new City();
        city.setId(1);
        city.setName("Pune");
        city.setState("MH");
        city.setPincode(411001);
        System.out.println("City=" + city);
    }
}
