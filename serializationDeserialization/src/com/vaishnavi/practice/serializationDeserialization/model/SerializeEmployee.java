package com.vaishnavi.practice.serializationDeserialization.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Vaishnavi", "IT", 60000.00);

        try (FileOutputStream fos = new FileOutputStream("employee.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(emp);
            System.out.println("Employee object serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


