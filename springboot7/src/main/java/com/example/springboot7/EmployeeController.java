package com.example.springboot7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springboot7.model.Employee;
import com.example.springboot7.model.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/add-employee")
	public String addemployee() {
		return "insert-employee";
		
	}
	
	@PostMapping("/insert")
	public String insertemployee(@RequestParam String FirstName, @RequestParam String LastName, @RequestParam String Address, @RequestParam String Department, @RequestParam String Designation ) {
		
		Employee e1 = new Employee( FirstName, LastName, Address, Department, Designation);
		employeeService.add(e1);
		return "home";
		
	}

}
