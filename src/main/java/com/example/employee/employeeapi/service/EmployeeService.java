package com.example.employee.employeeapi.service;

import java.util.List;

import com.example.employee.employeeapi.model.entity.Employee;
import com.example.employee.employeeapi.model.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}