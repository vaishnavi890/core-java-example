package com.vaishnavi.practice.stream.anotherExample;

import java.util.*;

public class MedicalExample {
    public static void main(String[] args) {
        // List of Patients (ArrayList)
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(101, "John Doe", 30, "Flu"));
        patients.add(new Patient(102, "Alice Smith", 25, "Cold"));
        patients.add(new Patient(103, "Robert Brown", 40, "Diabetes"));
        patients.add(new Patient(104, "Emily Davis", 35, "Fever"));

        // Using Stream API to filter patients above 30 years old
        System.out.println("\nPatients above 30 years old:");
        patients.stream()
                .filter(p -> p.getAge() > 30)
                .forEach(p -> System.out.println(p.getName() + " - " + p.getDisease()));

        // Using Map to store doctor information
        Map<Integer, String> doctors = new HashMap<>();
        doctors.put(1, "Dr. Smith - Cardiologist");
        doctors.put(2, "Dr. Johnson - Neurologist");
        doctors.put(3, "Dr. Williams - Dermatologist");

        // Iterating over Map using Iterator
        System.out.println("\nDoctor Information:");
        Iterator<Map.Entry<Integer, String>> iterator = doctors.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Doctor ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
