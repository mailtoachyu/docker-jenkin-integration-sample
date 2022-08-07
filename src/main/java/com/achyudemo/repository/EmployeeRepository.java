package com.achyudemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achyudemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
