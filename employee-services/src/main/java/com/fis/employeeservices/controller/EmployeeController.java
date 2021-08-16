package com.fis.employeeservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.employeeservices.bean.Employee;

@RestController
@RequestMapping("/id")
public class EmployeeController {

	@GetMapping("/{number}")
	public Employee getid(@PathVariable long number) {
		return new Employee(98, "Akash", 2000.0, true);
	}
}