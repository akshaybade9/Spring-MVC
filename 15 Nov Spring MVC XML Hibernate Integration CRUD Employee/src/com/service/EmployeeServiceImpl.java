package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeServiceDao;
import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeServiceDao employeeServiceDao;
	
	
	@Override
	public void addEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		employeeServiceDao.addEmployeeDetails(employee);
		
	}


	@Override
	public List<Employee> getAllEmployeeList(String uname, String pass) {
		// TODO Auto-generated method stub
		return employeeServiceDao.getAllEmployeeList(uname, pass);
	}

	
}
