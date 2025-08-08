package com.vaishnavi.practice.staticInjava.staticBlock;

public class FootballTeam {

    // Static variables
    static String teamName;
    static String[] players;

    // Static block - runs once when the class is loaded
    static {
        System.out.println("Initializing Football Team Data...");

        teamName = "Thunder Strikers FC";
        players = new String[] {
                "John Smith", "Alex Johnson", "Michael Lee",
                "David Clark", "Chris Brown", "Ethan White",
                "Liam Harris", "Oliver King", "Lucas Hall",
                "Mason Scott", "James Turner"
        };

        System.out.println("Team Name: " + teamName);
        System.out.println("Players List Loaded.");
    }

    // Static method to display players
    static void showPlayers() {
        System.out.println("Players of " + teamName + ":");
        for (String player : players) {
            System.out.println("- " + player);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Football Management System!");

        // Call the static method
        FootballTeam.showPlayers();
    }
}

