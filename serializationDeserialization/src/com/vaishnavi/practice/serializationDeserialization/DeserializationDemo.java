package com.vaishnavi.practice.serializationDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
        Student s = (Student) in.readObject();

        System.out.println(s.rollNo + " " + s.name);

        in.close();
    }
}

