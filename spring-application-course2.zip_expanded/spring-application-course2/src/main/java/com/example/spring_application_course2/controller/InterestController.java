package com.example.spring_application_course2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_application_course2.service.InterestService;

@RestController
public class InterestController {
	@Autowired
	private InterestService interestService;

	@GetMapping("/simple-interest")
	public double getSimpleInterest(@RequestParam double principal,@RequestParam double rate,@RequestParam double time) {
		return interestService.calculateSimpleInterest(principal, rate, time);
	}

}
