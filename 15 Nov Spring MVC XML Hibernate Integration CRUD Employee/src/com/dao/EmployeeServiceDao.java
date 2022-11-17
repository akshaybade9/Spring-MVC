package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeServiceDao {

	void addEmployeeDetails(Employee employee);

	List<Employee> getAllEmployeeList(String uname , String pass); 

}
