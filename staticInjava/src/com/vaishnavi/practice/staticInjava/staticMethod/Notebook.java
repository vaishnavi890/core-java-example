package com.vaishnavi.practice.staticInjava.staticMethod;

public class Notebook {

    // Static variable to store notes
    static String[] notes = new String[5];
    static int noteCount = 0;

    // Static method to add a note
    public static void addNote(String note) {
        if (noteCount < notes.length) {
            notes[noteCount] = note;
            noteCount++;
            System.out.println("Note added: " + note);
        } else {
            System.out.println("Notebook is full. Cannot add more notes.");
        }
    }

    // Static method to display all notes
    public static void showNotes() {
        System.out.println("=== Your Notes ===");
        if (noteCount == 0) {
            System.out.println("No notes found.");
        } else {
            for (int i = 0; i < noteCount; i++) {
                System.out.println((i + 1) + ". " + notes[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Static Notebook!");

        // Calling static methods without creating an object
        Notebook.addNote("Buy groceries");
        Notebook.addNote("Finish Java assignment");
        Notebook.addNote("Call mom");

        Notebook.showNotes();
    }
}
