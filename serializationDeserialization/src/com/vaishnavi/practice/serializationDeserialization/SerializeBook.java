package com.vaishnavi.practice.serializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeBook {
    public static void main(String[] args) {
        Book book = new Book(101, "Java Programming", "Vaishnavi Chewale");

        try (FileOutputStream fos = new FileOutputStream("book.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(book);
            System.out.println("✅ Book object serialized to book.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

