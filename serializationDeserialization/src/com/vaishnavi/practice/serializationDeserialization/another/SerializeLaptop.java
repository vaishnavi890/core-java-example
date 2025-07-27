package com.vaishnavi.practice.serializationDeserialization.another;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeLaptop {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "Inspiron 15", 55000.0, "secret123");

        try (FileOutputStream fos = new FileOutputStream("laptop.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(laptop);
            System.out.println("Laptop object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


