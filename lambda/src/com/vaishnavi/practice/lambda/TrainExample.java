package com.vaishnavi.practice.lambda;

public class TrainExample {
    public static void main(String[] args) {
        // Using Lambda Expressions for different train behaviors
        Train expressTrain = new Train("Express Train", () -> System.out.println("🚆 Speeding at 120 km/h!"));
        Train cargoTrain = new Train("Cargo Train", () -> System.out.println("🚛 Carrying heavy goods at 60 km/h!"));
        Train bulletTrain = new Train("Bullet Train", () -> System.out.println("🚄 Zooming at 320 km/h!"));
        Train metroTrain = new Train("Metro Train", () -> System.out.println("🚇 Stopping at every station!"));

        // Array of trains
        Train[] trains = {expressTrain, cargoTrain, bulletTrain, metroTrain};

        // Using Stream API to execute train operations
        System.out.println("\n🚆 Train Operations:");
        for (Train t : trains) {
            t.run();
        }
    }
}
