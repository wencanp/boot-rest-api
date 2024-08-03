package com.example.boot_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired EmployeeManager employeeManager;

    @GetMapping(produces = "application/json")
    public Employees getAllEmployees() {
        return employeeManager.getAllEmployees();
    }
}
