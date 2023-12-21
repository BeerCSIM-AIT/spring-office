package com.example.office.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.office.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
