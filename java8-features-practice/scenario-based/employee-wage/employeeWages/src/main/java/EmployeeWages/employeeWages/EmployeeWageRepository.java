package EmployeeWages.employeeWages;

import java.util.List;
import java.util.ArrayList;

public class EmployeeWageRepository {

    private List<CompanyEmployeeWage> companies = new ArrayList<>();

    public void addCompany(CompanyEmployeeWage company) {
        companies.add(company);
    }

    public List<CompanyEmployeeWage> getCompanies() {
        return companies;
    }
}
