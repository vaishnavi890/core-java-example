package com.vaishnavi.practice.serializationDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(210, "shreya");
        FileOutputStream file = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(s1);
        out.flush();

        System.out.println("Success");
    }
}

