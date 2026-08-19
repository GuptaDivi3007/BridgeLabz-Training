package com.payroll.PayrollApp.repository;

import com.payroll.PayrollApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}