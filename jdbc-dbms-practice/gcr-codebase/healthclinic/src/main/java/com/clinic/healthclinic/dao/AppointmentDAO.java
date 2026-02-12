package com.clinic.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.Time;
import com.clinic.healthclinic.util.DBConnection;

public class AppointmentDAO {

    public void bookAppointment(int patientId, int doctorId, Date date, Time time) {

        String sql = "INSERT INTO appointments(patient_id, doctor_id, appointment_date, appointment_time, status) VALUES (?, ?, ?, ?, 'SCHEDULED')";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ps.setInt(2, doctorId);
            ps.setDate(3, date);
            ps.setTime(4, time);

            ps.executeUpdate();
            System.out.println("Appointment booked!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
