package com.example.springboot7.model;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	//adding
	public void add(Employee employee) {
		repo.save(employee);
	}
	
	// update method
	public void update(Employee employee) {
		repo.save(employee);
	}
	
	//show method
	List<Employee> getAll(){
		return repo.findAll();
		
	}
	
	//delete method
	public void delete(Employee employee) {
		repo.delete(employee);
	}
}
