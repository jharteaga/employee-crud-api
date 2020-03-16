package com.example.employee.employeeapi.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import com.example.employee.employeeapi.model.entity.Employee;
import com.example.employee.employeeapi.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(path = "/{id}")
    public Optional<Employee> validateEmployeeCode(@PathVariable("id") String id) {
        return employeeService.validateEmployeeCode(Integer.parseInt(id));
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping(path = "/{id}")
    public Employee updateEmployee(@PathVariable("id") String id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(Integer.parseInt(id), employee);
    }

}