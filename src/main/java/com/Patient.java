package com.hospital;

public class Patient {
    private int id;
    private String name;
    private String dob;
    private String contactNumber;

    public Patient(int id, String name, String dob, String contactNumber) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void displayInfo() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Contact: " + contactNumber);
    }
}
