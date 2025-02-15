package com.example.boot_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired EmployeeManager employeeManager;

    @GetMapping(produces = "application/json")
    public Employees getAllEmployees() {
        return employeeManager.getAllEmployees();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeManager.getEmployeeById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getEmployee_id())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public void updateEmployee(@RequestBody Employee employee) {
        employeeManager.updateEmployee(employee);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEmployeeById(@PathVariable String id) {
        employeeManager.deleteEmployeeById(id);
    }
}
