package com.clinic.dao;

import com.clinic.dto.Appointment;

import java.util.List;

public interface AppointmentDAO {

    boolean addAppointment(Appointment appointment);

    boolean updateAppointment(Appointment appointment);

    boolean deleteAppointment(int appointmentId);

    Appointment getAppointmentById(int appointmentId);

    List<Appointment> getAllAppointments();
}