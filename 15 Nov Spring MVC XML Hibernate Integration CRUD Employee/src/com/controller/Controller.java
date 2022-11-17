package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Employee;
import com.service.EmployeeService;

@org.springframework.stereotype.Controller
public class Controller {

	
	@Autowired
	private EmployeeService employeeService;
	

	@RequestMapping(value = "/reg")
	public String addEmployeeDetails(@ModelAttribute Employee employee) {
		
		System.out.println("Registered Employee" +" "+employee);
		
		employeeService.addEmployeeDetails(employee);
	
		
		return "login";
	}
	
	
	@RequestMapping(value = "/log")
	public String getAllEmployeeData(@RequestParam String uname , @RequestParam String pass , Model m) {
		
		System.out.println("Employee Usename" +" "+uname);
		
		System.out.println("Employee password" +" "+pass);

		List<Employee> elist = employeeService.getAllEmployeeList(uname, pass);
		
		m.addAttribute("list", elist);
		
	
		
		return "success";
	}

	
	
}
