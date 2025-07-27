package com.vaishnavi.practice.serializationDeserialization.another;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeFood {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("food.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Food food = (Food) ois.readObject();
            System.out.println("Deserialized Food: " + food);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

