package com.example.boot_rest_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees implements Iterable<Employee> {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        if (employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public Iterator<Employee> iterator() {
        return employeeList.iterator();
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
