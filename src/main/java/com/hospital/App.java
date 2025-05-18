package com.hospital;

public class App {
    public static void main(String[] args) {
        PatientService service = new PatientService();

        Patient p1 = new Patient(1, "Karan", "1990-01-15", "9876543210");
        Patient p2 = new Patient(2, "Mukesh", "1985-06-30", "9123456780");

        service.addPatient(p1);
        service.addPatient(p2);

        System.out.println("\nAll Patients:");
        for (Patient p : service.getAllPatients()) {
            p.displayInfo();
            System.out.println("----------------------");
        }

        System.out.println("Searching for patient with ID 2:");
        Patient found = service.findPatientById(2);
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Patient not found.");
        }
    }
}