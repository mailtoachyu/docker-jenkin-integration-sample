package com.achyudemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achyudemo.model.Employee;
import com.achyudemo.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/login")
	public String login() {
		return "welcome to docker App. learn and do achyu and rina.";
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp) {
		return employeeRepository.save(emp);
	}

}
