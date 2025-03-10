package com.vaishnavi.practices.multithreading.threadMethod;

public class BookExample extends Thread{
    private final String bookName;
    private final int chapters;

    public BookExample(String bookName, int chapters) {
        this.bookName = bookName;
        this.chapters = chapters;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= chapters; i++) {
                System.out.println("Reading chapter " + i + " of \"" + bookName + "\"");
                // Simulate time taken to read each chapter
                Thread.sleep(700);
            }
            System.out.println("Finished reading \"" + bookName + "\"");
        } catch (InterruptedException e) {
            System.out.println("Reading \"" + bookName + "\" was interrupted.");
        }
    }
        public static void main(String args[]) {
            // Creating book threads
            BookExample book1 = new BookExample("The Java Journey", 3);
            BookExample book2 = new BookExample("Concurrency in Practice", 4);
            BookExample book3 = new BookExample("Effective Java", 2);

            // Starting the threads using start() method
            book1.start();
            book2.start();
            book3.start();
        }
    }

