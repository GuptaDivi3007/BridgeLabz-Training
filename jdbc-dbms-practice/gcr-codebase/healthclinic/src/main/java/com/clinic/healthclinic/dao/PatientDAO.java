package com.clinic.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.clinic.healthclinic.model.Patient;
import com.clinic.healthclinic.util.DBConnection;

public class PatientDAO {

    public void addPatient(Patient patient) {

        String sql = "INSERT INTO patients(name, dob, contact, email, address, blood_group) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, patient.getName());
            ps.setDate(2, patient.getDob());
            ps.setString(3, patient.getContact());
            ps.setString(4, patient.getEmail());
            ps.setString(5, patient.getAddress());
            ps.setString(6, patient.getBloodGroup());

            ps.executeUpdate();
            System.out.println("Patient added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
