package com.clinic.healthclinic.model;

public class Doctor {

    private int doctorId;
    private String name;
    private String contact;
    private double consultationFee;
    private int specialtyId;
    private boolean isActive;

    public Doctor(String name, String contact, double consultationFee, int specialtyId) {
        this.name = name;
        this.contact = contact;
        this.consultationFee = consultationFee;
        this.specialtyId = specialtyId;
        this.isActive = true;
    }

    public String getName() { return name; }
    public String getContact() { return contact; }
    public double getConsultationFee() { return consultationFee; }
    public int getSpecialtyId() { return specialtyId; }
    public boolean isActive() { return isActive; }
}
