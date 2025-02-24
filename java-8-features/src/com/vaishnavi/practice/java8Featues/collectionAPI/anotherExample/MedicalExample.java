package com.vaishnavi.practice.java8Featues.collectionAPI.anotherExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MedicalExample {
    public static void main(String[] args) {
        // Creating a List of Medical Records
        List<MedicalRecord> records = new ArrayList<>();
        records.add(new MedicalRecord(101, "Raj", 45, "Diabetes", 5000.00));
        records.add(new MedicalRecord(102, "Riya", 30, "Flu", 1500.00));
        records.add(new MedicalRecord(103, "Supriya", 65, "Hypertension", 7000.00));
        records.add(new MedicalRecord(104, "David", 50, "Asthma", 4500.00));

        // Sorting Records by Bill Amount (Ascending)
        Collections.sort(records, Comparator.comparingDouble(MedicalRecord::getBillAmount));

        System.out.println("\nMedical Records sorted by bill amount:");
        records.forEach(System.out::println);

        // Filtering records where age is greater than 40
        List<MedicalRecord> seniorPatients = records.stream()
                .filter(record -> record.getAge() > 40)
                .collect(Collectors.toList());

        System.out.println("\nPatients older than 40:");
        seniorPatients.forEach(System.out::println);

        // Searching for a medical record by Patient ID
        int searchPatientId = 102;
        MedicalRecord foundRecord = records.stream()
                .filter(record -> record.getPatientId() == searchPatientId)
                .findFirst()
                .orElse(null);

        System.out.println("\nSearch result for Patient ID " + searchPatientId + ": " + (foundRecord != null ? foundRecord : "Not Found"));
    }
}
