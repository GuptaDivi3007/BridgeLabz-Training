package com.clinic.dao;

import com.clinic.dto.Doctor;
import java.util.List;

public interface DoctorDAO {
    boolean addDoctor(Doctor doctor);
    boolean updateDoctor(Doctor doctor);
    boolean deleteDoctor(int doctor_id);
    Doctor getDoctorById(int doctor_id);
    List<Doctor> getAllDoctors();
}