package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Customer;
import com.service.CustomerService;
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping(value = "/reg")
	public String addCustomerData(@ModelAttribute Customer customer) {
		
		System.out.println("Registered Data : " +" "+customer);
		customerService.addCustomerData(customer);
		
		return "login";
	}

	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam String uname , @RequestParam String pass , Model m)  {
		
		System.out.println("Login Data : ");
		System.out.println("User Name is: "+uname);
		
		System.out.println("Password is :  "+pass);

		List<Customer> slist = customerService.getAllData(uname, pass);
		
	//	System.out.println(slist);
		
		m.addAttribute("cl", slist);
		
		return "success";
	}
	
}
