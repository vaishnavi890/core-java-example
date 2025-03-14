package com.vaishnavi.practices.multithreading.interThreading.notify;

public class Library {
    private boolean bookAvailable = false;

    public synchronized void returnBook() {
        System.out.println("Book returned to the library.");
        bookAvailable = true;
        notify(); // Notify one waiting student
    }

    public synchronized void borrowBook(String studentName) {
        while (!bookAvailable) {
            try {
                System.out.println(studentName + " is waiting for the book...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(studentName + " borrowed the book.");
        bookAvailable = false;
    }
    public static void main(String[] args) {
        Library library = new Library();

        // Student thread waiting for the book
        new Thread(() -> library.borrowBook("Alice")).start();

        // Simulate book return after a short delay
        new Thread(() -> {
            try {
                Thread.sleep(1000); // Delay before returning the book
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            library.returnBook();
        }).start();
    }
}
