package com.vaishnavi.practice.staticInjava.staticBlock;

public class Library {

    // Static variables
    static String libraryName;
    static String[] bookCategories;

    // Static block - runs only once when the class is loaded
    static {
        System.out.println("Loading Library Data...");

        libraryName = "City Central Library";
        bookCategories = new String[] {"Fiction", "Non-Fiction", "Science", "History", "Children"};

        System.out.println("Library Name: " + libraryName);
        System.out.println("Available Categories Loaded.");
    }

    // Static method to display categories
    static void showCategories() {
        System.out.println("Book Categories:");
        for (String category : bookCategories) {
            System.out.println("- " + category);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Library System!");

        // Call the static method
        Library.showCategories();
    }
}


