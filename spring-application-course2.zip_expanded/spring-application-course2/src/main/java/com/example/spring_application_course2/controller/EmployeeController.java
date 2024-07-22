package com.example.spring_application_course2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_application_course2.model.Employee;
@RestController
public class EmployeeController {
	@Autowired
	private Employee employee;
	
	@GetMapping("/employee")
	public Employee getEmployee() {
		return employee;
	}

}
