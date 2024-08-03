package com.example.boot_rest_api;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {

    private static Employees list = new Employees();

    static
    {
        list.getEmployeeList().add(
                new Employee("1",
                        "John",
                        "Doe",
                        "john.doe@example.com",
                        "Developer"));
        list.getEmployeeList().add(
                new Employee("2",
                        "Jane",
                        "Smith",
                        "jane.smith@example.com",
                        "Designer"));
        list.getEmployeeList().add(
                new Employee("3",
                        "Jim",
                        "Beam",
                        "jim.beam@example.com",
                        "Manager"));
    }

    public Employees getAllEmployees() { return list; }

    public Employee getEmployeeById(String id) {
        for (Employee employee : list) {
            if (employee.getEmployee_id().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
