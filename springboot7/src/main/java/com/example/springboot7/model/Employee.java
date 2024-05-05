package com.example.springboot7.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String FirstName;
	private String LastName;
	private String Address;
	private String Department;
	private String Designation;
	
	public Employee(String firstName, String lastName, String address, String department, String designation) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Department = department;
		Designation = designation;
	}
	
	
	
	
	

}
