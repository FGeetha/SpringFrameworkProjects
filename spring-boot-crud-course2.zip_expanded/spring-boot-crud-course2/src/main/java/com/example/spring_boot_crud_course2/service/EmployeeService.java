package com.example.spring_boot_crud_course2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring_boot_crud_course2.repository.EmployeeRepository;
import com.example.spring_boot_crud_course2.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@GetMapping
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	public Optional<Employee> getEmployeeById(Long id){
		return employeeRepository.findById(id);
	}
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	public Employee updateEmployee(Long id, Employee employeeDetails) {
		Employee employee = employeeRepository.findById(id).orElseThrow(() ->new RuntimeException("Employee not found"));
		employee .setName(employeeDetails.getName());
		employee.setAge(employeeDetails.getAge());
		employee.setDepartment(employeeDetails.getDepartment());
		return employeeRepository.save(employee);
	}
	public void deleteEmployee(Long id) {
		Employee employee= employeeRepository.findById(id).orElseThrow(() ->new RuntimeException("Employee not found"));
		employeeRepository.delete(employee);
	}
	
	
	

}
