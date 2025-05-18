package com.hospital;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients;

    public PatientService() {
        patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient.getName());
    }

    public Patient findPatientById(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Patient> getAllPatients() {
        return patients;
    }
}
