package com.vaishnavi.practice.exceptionHandling.tryCatchExample;

import com.vaishnavi.practice.exceptionHandling.exception.DoctorUnavailableException;
import com.vaishnavi.practice.exceptionHandling.exception.InvalidAgeException;

public class HealthCareExample {
    public static void main(String[] args) {
        try {
            String patientName = "John Doe";
            int age = 150; // Try changing to a valid age like 35
            String doctor = "Dr. Smith"; // Try changing to "Dr. Brown"

            registerPatient(patientName, age, doctor);
            System.out.println("✅ Appointment confirmed for " + patientName + " with " + doctor);
        }
        catch (InvalidAgeException e) {
            System.out.println("Age Error: " + e.getMessage());
        }
        catch (DoctorUnavailableException e) {
            System.out.println("Doctor Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
        finally {
            System.out.println("🏥 Thank you for choosing our hospital.");
        }
    }

    // Method to register a patient
    public static void registerPatient(String name, int age, String doctor)
            throws InvalidAgeException, DoctorUnavailableException {

        // Age validation
        if (age <= 0 || age > 120) {
            throw new InvalidAgeException("Invalid age entered: " + age);
        }

        // Doctor availability check
        String[] availableDoctors = {"Dr. Smith", "Dr. Adams", "Dr. Lee"};
        boolean doctorFound = false;
        for (String available : availableDoctors) {
            if (available.equalsIgnoreCase(doctor)) {
                doctorFound = true;
                break;
            }
        }

        if (!doctorFound) {
            throw new DoctorUnavailableException(doctor + " is not available today.");
        }
    }
}
