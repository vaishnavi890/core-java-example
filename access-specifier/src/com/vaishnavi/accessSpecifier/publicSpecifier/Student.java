package com.vaishnavi.accessSpecifier.publicSpecifier;

public class Student {
    public int id;
    public String name;
    public String city;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

