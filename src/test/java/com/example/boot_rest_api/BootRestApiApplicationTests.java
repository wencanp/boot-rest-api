package com.example.boot_rest_api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BootRestApiApplicationTests {

    @Mock
    private EmployeeManager employeeManager;

    int getEmployeeCount(EmployeeManager manager)
    {
        return manager.getAllEmployees().getEmployeeList().size();
    }

    // ensure employee list initialized with contents
    @Test
    void createEmployeeManager() {
        EmployeeManager newEmployeeManager = new EmployeeManager();
        assert(getEmployeeCount(newEmployeeManager) != 0);
    }

    // ensure adding an employee increases the total number list size by 1
    @Test
    void addEmployee() {
        EmployeeManager employeeManagerTest = new EmployeeManager();
        int employeeCount = getEmployeeCount(employeeManagerTest);
        Employee employee = new Employee("1",
                "John",
                "Doe",
                "john.doe@example.com",
                "Developer");
        employeeManagerTest.addEmployee(employee);
        assert(employeeCount + 1 == getEmployeeCount(employeeManagerTest));
    }

    @ExtendWith(MockitoExtension.class)
    @BeforeEach
    void setUp() {
        this.employeeManager = new EmployeeManager();
        Employee newEmployee = new Employee("1",
                "John",
                "Doe",
                "john.doe@example.com",
                "Developer");
        this.employeeManager.addEmployee(newEmployee);
    }

    // ensure the employee added and id can be found
    @Test
    void employeeIdInList() {
        List<Employee> employees = this.employeeManager
                .getAllEmployees().getEmployeeList();
        for (Employee employee : employees) {
            if (employee.getEmployee_id().equals("1")) { return; }
        }
        assert(false);
    }

    // ensure the employee added and first name can be found
    @Test
    void employeeFirstNameInList() {
        List<Employee> employees = this.employeeManager
                .getAllEmployees().getEmployeeList();
        for (Employee employee : employees) {
            if (employee.getFirst_name().equals("John")) { return; }
        }
        assert(false);
    }

    // ensure the employee added and last name can be found
    @Test
    void employeeLastNameInList() {
        List<Employee> employees = this.employeeManager
                .getAllEmployees().getEmployeeList();
        for (Employee employee : employees) {
            if (employee.getLast_name().equals("Doe")) { return; }
        }
        assert(false);
    }

    // ensure the employee added and email can be found
    @Test
    void employeeEmailInList() {
        List<Employee> employees = this.employeeManager
                .getAllEmployees().getEmployeeList();
        for (Employee employee : employees) {
            if (employee.getEmail().equals("john.doe@example.com")) { return; }
        }
        assert(false);
    }

    // ensure the employee added and last name can be found
    @Test
    void employeeTitleInList() {
        List<Employee> employees = this.employeeManager
                .getAllEmployees().getEmployeeList();
        for (Employee employee : employees) {
            if (employee.getTitle().equals("Developer")) { return; }
        }
        assert(false);
    }
}
