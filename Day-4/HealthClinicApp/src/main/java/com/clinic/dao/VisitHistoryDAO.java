package com.clinic.dao;

import com.clinic.dto.VisitHistory;

import java.util.List;

public interface VisitHistoryDAO {

    boolean addVisitHistory(VisitHistory visitHistory);

    boolean updateVisitHistory(VisitHistory visitHistory);

    boolean deleteVisitHistory(int visitId);

    VisitHistory getVisitHistoryById(int visitId);

    List<VisitHistory> getAllVisitHistory();
}