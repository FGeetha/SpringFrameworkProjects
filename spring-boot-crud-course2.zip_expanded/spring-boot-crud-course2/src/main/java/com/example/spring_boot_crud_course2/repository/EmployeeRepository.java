package com.example.spring_boot_crud_course2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_boot_crud_course2.model.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
