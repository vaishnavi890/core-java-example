package com.vaishnavi.practice.stream.anotherExample;

import java.util.*;

public class BookExample {
    public static void main(String[] args) {
        // List of Books (ArrayList)
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Java Programming", "James Gosling", 500));
        books.add(new Book(102, "Effective Java", "Joshua Bloch", 400));
        books.add(new Book(103, "Spring in Action", "Craig Walls", 600));
        books.add(new Book(104, "Clean Code", "Robert C. Martin", 450));

        // Using Stream API to filter books with more than 450 pages
        System.out.println("\nBooks with more than 450 pages:");
        books.stream()
                .filter(b -> b.getPages() > 450)
                .forEach(b -> System.out.println(b.getTitle() + " by " + b.getAuthor()));

        // Using Map to store book category information
        Map<Integer, String> bookCategories = new HashMap<>();
        bookCategories.put(1, "Programming");
        bookCategories.put(2, "Software Development");
        bookCategories.put(3, "Computer Science");

        // Iterating over Map using Iterator
        System.out.println("\nBook Categories:");
        Iterator<Map.Entry<Integer, String>> iterator = bookCategories.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Category ID: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
