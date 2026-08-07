package com.clinic.dao;

import com.clinic.dto.Patient;
import java.util.List;

public interface PatientDAO {
    boolean addPatient(Patient patient);
    Patient getPatientById(int patientId);
    List<Patient> getAllPatients();
    boolean updatePatient(Patient patient);
    boolean deletePatient(int patientId);
}