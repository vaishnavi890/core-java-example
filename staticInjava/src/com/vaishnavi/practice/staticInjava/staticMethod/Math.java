package com.vaishnavi.practice.staticInjava.staticMethod;

// Static Methods
//A static method belongs to the class, not to an instance. You can call it without creating an object.

class MathUtil {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Math {
    public static void main(String[] args) {
        int result = MathUtil.add(4, 9);// No object needed
        System.out.println("sum is " + result);
    }
}

