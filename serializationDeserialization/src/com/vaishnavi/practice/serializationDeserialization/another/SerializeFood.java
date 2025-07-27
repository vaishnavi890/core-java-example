package com.vaishnavi.practice.serializationDeserialization.another;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeFood {
    public static void main(String[] args) {
        Food food = new Food("Paneer Butter Masala", "Main Course", 220.0, true);

        try (FileOutputStream fos = new FileOutputStream("food.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(food);
            System.out.println("Food object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
