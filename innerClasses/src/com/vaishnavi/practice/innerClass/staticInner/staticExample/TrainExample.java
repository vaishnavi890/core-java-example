package com.vaishnavi.practice.innerClass.staticInner.staticExample;

public class TrainExample {
    public static void main(String[] args) {
        // Creating an instance of the static inner class
        Train.Coach sleeperCoach = new Train.Coach("Sleeper", 72);
        Train.Coach acCoach = new Train.Coach("AC", 50);

        // Display Coach Details
        sleeperCoach.displayCoachDetails();
        System.out.println("-------------------");
        acCoach.displayCoachDetails();
    }
}
