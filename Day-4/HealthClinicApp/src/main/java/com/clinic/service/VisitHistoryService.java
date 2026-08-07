package com.clinic.service;

import com.clinic.dao.VisitHistoryDAO;
import com.clinic.dao.VisitHistoryDAOImpl;
import com.clinic.dto.VisitHistory;
import com.clinic.exception.ValidationException;

import java.util.List;

public class VisitHistoryService {

    private final VisitHistoryDAO visitHistoryDAO =
            new VisitHistoryDAOImpl();

    public boolean addVisitHistory(VisitHistory visitHistory){

        if(visitHistory.getAppointmentId()<=0)
            throw new ValidationException("Invalid Appointment ID.");

        if(visitHistory.getDiagnosis()==null ||
                visitHistory.getDiagnosis().isBlank())
            throw new ValidationException("Diagnosis cannot be empty.");

        if(visitHistory.getPrescription()==null ||
                visitHistory.getPrescription().isBlank())
            throw new ValidationException("Prescription cannot be empty.");

        return visitHistoryDAO.addVisitHistory(visitHistory);
    }

    public boolean updateVisitHistory(VisitHistory visitHistory){
        return visitHistoryDAO.updateVisitHistory(visitHistory);
    }

    public boolean deleteVisitHistory(int visitId){
        return visitHistoryDAO.deleteVisitHistory(visitId);
    }

    public VisitHistory getVisitHistoryById(int visitId){
        return visitHistoryDAO.getVisitHistoryById(visitId);
    }

    public List<VisitHistory> getAllVisitHistory(){
        return visitHistoryDAO.getAllVisitHistory();
    }
}