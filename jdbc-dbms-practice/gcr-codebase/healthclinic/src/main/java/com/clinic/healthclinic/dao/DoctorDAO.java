package com.clinic.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.clinic.healthclinic.util.DBConnection;

public class DoctorDAO {

    public void addDoctor(String name, String contact, double fee, int specialtyId) {

        String sql = "INSERT INTO doctors(name, contact, consultation_fee, specialty_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, contact);
            ps.setDouble(3, fee);
            ps.setInt(4, specialtyId);

            ps.executeUpdate();
            System.out.println("Doctor added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

