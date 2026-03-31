package com.clinic.healthclinic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.clinic.healthclinic.util.DBConnection;

public class BillingDAO {

    public void generateBill(int visitId, double amount) {

        String sql = "INSERT INTO bills(visit_id, total_amount, payment_status) VALUES (?, ?, 'UNPAID')";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, visitId);
            ps.setDouble(2, amount);

            ps.executeUpdate();
            System.out.println("Bill generated!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
