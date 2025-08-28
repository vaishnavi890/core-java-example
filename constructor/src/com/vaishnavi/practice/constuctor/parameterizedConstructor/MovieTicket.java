package com.vaishnavi.practice.constuctor.parameterizedConstructor;

public class MovieTicket {
        String movieName;
        String customerName;
        int seats;
        double pricePerSeat;

        // Parameterized Constructor
        MovieTicket(String movieName, String customerName, int seats, double pricePerSeat) {
            this.movieName = movieName;
            this.customerName = customerName;
            this.seats = seats;
            this.pricePerSeat = pricePerSeat;
        }

        // Method to calculate total price
        double calculateTotal() {
            return seats * pricePerSeat;
        }

        // Display ticket details
        void displayTicket() {
            System.out.println("Movie: " + movieName);
            System.out.println("Customer: " + customerName);
            System.out.println("Seats: " + seats);
            System.out.println("Price per Seat: ₹" + pricePerSeat);
            System.out.println("Total Amount: ₹" + calculateTotal());
            System.out.println("-----------------------------------");
        }

        public static void main(String[] args) {
            MovieTicket t1 = new MovieTicket("Pathaan", "Vaishnavi", 2, 250.0);
            MovieTicket t2 = new MovieTicket("Jawan", "Aniket", 3, 200.0);

            t1.displayTicket();
            t2.displayTicket();
        }

}
