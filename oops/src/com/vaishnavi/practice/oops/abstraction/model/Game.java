package com.vaishnavi.practice.oops.abstraction.model;

public abstract class Game {
    public abstract void start();  // Abstract method (must be implemented in subclasses)
    public abstract void play();
    public abstract void end();

    // Concrete method
    public void displayRules() {
        System.out.println("These are the general game rules.");
    }
}

