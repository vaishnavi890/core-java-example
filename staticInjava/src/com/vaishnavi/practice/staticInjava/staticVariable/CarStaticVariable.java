package com.vaishnavi.practice.staticInjava.staticVariable;

class Honda {
    static int no = 10;

    Honda() {
        no++;
    }
}

public class CarStaticVariable {
    public static void main(String[] args) {
        new Honda();
        new Honda();
        System.out.println(Honda.no);

    }
}

