package com.clinic.service;

import com.clinic.dao.BillingDAO;
import com.clinic.dao.BillingDAOImpl;
import com.clinic.dto.Billing;
import com.clinic.exception.ValidationException;

import java.util.List;

public class BillingService {

    private final BillingDAO billingDAO =
            new BillingDAOImpl();

    public boolean addBilling(Billing billing){

        if(billing.getAppointmentId()<=0)
            throw new ValidationException("Invalid Appointment ID.");

        if(billing.getTotalAmount().doubleValue()<=0)
            throw new ValidationException("Amount must be greater than zero.");

        if(billing.getPaymentStatus()==null ||
                billing.getPaymentStatus().isBlank())
            billing.setPaymentStatus("Pending");

        return billingDAO.addBilling(billing);
    }

    public boolean updateBilling(Billing billing){
        return billingDAO.updateBilling(billing);
    }

    public boolean deleteBilling(int billingId){
        return billingDAO.deleteBilling(billingId);
    }

    public Billing getBillingById(int billingId){
        return billingDAO.getBillingById(billingId);
    }

    public List<Billing> getAllBillings(){
        return billingDAO.getAllBillings();
    }
}