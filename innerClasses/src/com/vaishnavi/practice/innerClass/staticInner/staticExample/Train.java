package com.vaishnavi.practice.innerClass.staticInner.staticExample;

public class Train {
    private static String trainName = "Express 101";

    // Static Inner Class
    static class Coach {
        private String coachType;
        private int seatCapacity;

        // Constructor for Coach
        public Coach(String coachType, int seatCapacity) {
            this.coachType = coachType;
            this.seatCapacity = seatCapacity;
        }

        void displayCoachDetails() {
            System.out.println("Train Name: " + trainName);
            System.out.println("Coach Type: " + coachType);
            System.out.println("Seat Capacity: " + seatCapacity);
        }
    }
}


