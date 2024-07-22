package com.example.spring_application_course2.service;

import org.springframework.stereotype.Service;

@Service

public class InterestService {
	public double calculateSimpleInterest(double principal,double rate, double time) {
		return (principal * rate * time)/100;
	}

}
