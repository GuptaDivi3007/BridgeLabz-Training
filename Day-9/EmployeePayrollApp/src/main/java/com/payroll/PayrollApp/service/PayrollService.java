package com.payroll.PayrollApp.service;

import org.springframework.stereotype.Service;

@Service
public class PayrollService {

    public String isRunning(){
        return "Employee Payroll App is bootstrapped and running successfully";
    }
}
