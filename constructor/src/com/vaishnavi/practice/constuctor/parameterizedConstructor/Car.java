package com.vaishnavi.practice.constuctor.parameterizedConstructor;

public class Car {
        String brand;
        String model;
        double price;

        // Parameterized Constructor
        Car(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        // Method to display car details
        void displayCarDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: ₹" + price);
            System.out.println("-------------------------------");
        }

        public static void main(String[] args) {
            Car c1 = new Car("Tesla", "Model X", 9000000);
            Car c2 = new Car("BMW", "X5", 8000000);
            Car c3 = new Car("Hyundai", "Creta", 1500000);

            c1.displayCarDetails();
            c2.displayCarDetails();
            c3.displayCarDetails();
        }
    }
    
