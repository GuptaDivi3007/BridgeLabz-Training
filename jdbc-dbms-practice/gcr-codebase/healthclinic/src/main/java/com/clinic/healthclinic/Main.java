package com.clinic.healthclinic;

import java.sql.Date;
import java.sql.Time;

import com.clinic.healthclinic.dao.*;
import com.clinic.healthclinic.model.Patient;

public class Main {
    public static void main(String[] args) {

        // Add Patient
        Patient patient = new Patient(
                "Navya",
                Date.valueOf("2003-05-10"),
                "9876543211",
                "navya2@gmail.com",
                "Agra",
                "O+"
        );

        PatientDAO patientDAO = new PatientDAO();
        patientDAO.addPatient(patient);

        // Add Doctor
        DoctorDAO doctorDAO = new DoctorDAO();
        doctorDAO.addDoctor("Dr. Sharma", "9999999999", 500.0, 1);

        // Book Appointment
        AppointmentDAO appointmentDAO = new AppointmentDAO();
        appointmentDAO.bookAppointment(1, 1,
                Date.valueOf("2026-02-15"),
                Time.valueOf("10:30:00"));
        
        VisitDAO visitDAO = new VisitDAO();
        visitDAO.recordVisit(1, "Fever", "Mild viral infection");


        // Generate Bill
        BillingDAO billingDAO = new BillingDAO();
        billingDAO.generateBill(1, 500.0);
    }
}
