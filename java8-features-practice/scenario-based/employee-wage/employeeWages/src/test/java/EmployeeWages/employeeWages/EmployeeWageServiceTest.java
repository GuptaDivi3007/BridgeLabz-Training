package EmployeeWages.employeeWages;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeWageServiceTest {

    @Test
    void givenCompany_whenComputed_shouldReturnTotalWage() {

        EmployeeWageServiceImpl service = new EmployeeWageServiceImpl();

        service.addCompany("Wipro", 20, 20, 100);
        service.computeWages();

        int totalWage = service.getTotalWageByCompany("Wipro");

        assertTrue(totalWage >= 0);
    }

    @Test
    void givenInvalidCompanyName_shouldThrowException() {

        EmployeeWageServiceImpl service = new EmployeeWageServiceImpl();

        assertThrows(IllegalArgumentException.class, () ->
                service.addCompany("12@", 20, 20, 100));
    }
}
