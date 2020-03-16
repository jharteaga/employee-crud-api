package com.example.employee.employeeapi.controller;

import java.util.List;

import com.example.employee.employeeapi.model.entity.Employee;
import com.example.employee.employeeapi.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}