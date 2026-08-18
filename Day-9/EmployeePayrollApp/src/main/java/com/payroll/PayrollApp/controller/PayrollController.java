package com.payroll.PayrollApp.controller;

import com.payroll.PayrollApp.service.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payroll")
public class PayrollController {
    private final PayrollService payrollService;

    @GetMapping
    public String isRunning(){
        return payrollService.isRunning();
    }
}
