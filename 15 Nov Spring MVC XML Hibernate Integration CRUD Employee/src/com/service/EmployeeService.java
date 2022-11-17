package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	

	void addEmployeeDetails(Employee employee);
	
	List<Employee> getAllEmployeeList(String uname , String pass); 
	
}
