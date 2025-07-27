package com.vaishnavi.practice.serializationDeserialization.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("employee.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Employee emp = (Employee) ois.readObject();
            System.out.println("Deserialized Employee: " + emp);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


