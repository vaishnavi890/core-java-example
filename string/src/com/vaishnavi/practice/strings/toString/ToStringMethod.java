package com.vaishnavi.practice.strings.toString;

public class ToStringMethod {
    int rollNo;
    String name;
    String city;

    ToStringMethod(int rollNo, String name, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {

        ToStringMethod toStringMethod = new ToStringMethod(1, " shreya ", "pune");
        System.out.println(" Details is " + toStringMethod);

    }

    public String toString() { //overriding the toString Method()
        return rollNo + name + city;
    }
}
