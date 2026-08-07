package com.clinic.service;

import com.clinic.exception.ValidationException;
import com.clinic.dto.Patient;
import com.clinic.dao.PatientDAO;
import com.clinic.dao.PatientDAOImpl;
import com.clinic.exception.*;

import java.util.List;

public class PatientService {
    private final PatientDAO patientDAO = new PatientDAOImpl();

    public boolean addPatient(Patient patient){
        //Business Validations

        if(patient.getFirstName() == null || patient.getFirstName().isBlank()){
            throw new ValidationException("First name cannot be null");
        }

        if(patient.getPhoneNumber() == null || patient.getPhoneNumber().length() != 10){
            throw new ValidationException("Invalid Phone number");
        }

        return patientDAO.addPatient(patient);
    }

    public Patient getPatientById(int id) {
        return patientDAO.getPatientById(id);
    }

    public List<Patient> getAllPatients() {
        return patientDAO.getAllPatients();
    }

    public boolean updatePatient(Patient patient) {

        if(patient.getPatientId() <=0){
            throw new ValidationException("Invalid Patiend Id");
        }
        if(patient.getFirstName() == null || patient.getFirstName().isBlank()){
            throw new ValidationException("First name cannot be empty");
        }
        return patientDAO.updatePatient(patient);
    }

    public boolean deletePatient(int patientId) {

        if (patientId <= 0) {
            throw new ValidationException("Invalid Patient Id");
        }

        return patientDAO.deletePatient(patientId);
    }
}