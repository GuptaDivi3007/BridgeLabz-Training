package com.clinic.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

import com.clinic.healthclinic.util.DBConnection;

public class VisitDAO {

    public void recordVisit(int appointmentId, String diagnosis, String notes) {

        String sql = "INSERT INTO visits(appointment_id, diagnosis, notes, visit_date) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);
            ps.setString(2, diagnosis);
            ps.setString(3, notes);
            ps.setDate(4, new Date(System.currentTimeMillis()));

            ps.executeUpdate();
            System.out.println("Visit recorded successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
