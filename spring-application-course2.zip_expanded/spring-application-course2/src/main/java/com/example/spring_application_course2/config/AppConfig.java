package com.example.spring_application_course2.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring_application_course2.model.Employee;
@Configuration
public class AppConfig {
	@Bean
	public Employee employee() {
		Employee employee= new Employee();
		employee.setName("John Doe");
		employee.setAge(30);
		employee.setAddresses(Arrays.asList("123 Main St", "456 High St"));
		return employee;
		
	}

}
