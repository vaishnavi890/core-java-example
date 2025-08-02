package com.vaishnavi.practice.staticClass.staticInner;

public class Outer {
    public String city;

    static class Inner {
        public String state;
        public String country;

        public void printData() {
            System.out.println("State is " + state + "| Country is " + country);
        }

    }
}
