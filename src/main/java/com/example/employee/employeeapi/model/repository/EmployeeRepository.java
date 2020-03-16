package com.example.employee.employeeapi.model.repository;

import com.example.employee.employeeapi.model.entity.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}