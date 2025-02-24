package com.vaishnavi.practice.java8Featues.collectionAPI.anotherExample;

public class MedicalRecord {
    private int patientId;
    private String patientName;
    private int age;
    private String disease;
    private double billAmount;

    // Constructor
    public MedicalRecord(int patientId, String patientName, int age, String disease, double billAmount) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
        this.billAmount = billAmount;
    }

    // Getters
    public int getPatientId() { return patientId; }
    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public String getDisease() { return disease; }
    public double getBillAmount() { return billAmount; }

    // toString() for printing
    @Override
    public String toString() {
        return "MedicalRecord{PatientID=" + patientId + ", Name='" + patientName + "', Age=" + age +
                ", Disease='" + disease + "', BillAmount=" + billAmount + "}";
    }
}
