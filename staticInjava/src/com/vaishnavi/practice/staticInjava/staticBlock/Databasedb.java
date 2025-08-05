package com.vaishnavi.practice.staticInjava.staticBlock;

// Static Block
//A static block is used to initialize static variables. It runs once when the class is first loaded.

class Database {
    static String url;

    static {
        url = "jdbc:mysql://localhost:3306/stepup";
        System.out.println("Static block executed");
    }
}

public class Databasedb {
    public static void main(String[] args) {
        System.out.println("DB URL: " + Database.url);
    }
}

