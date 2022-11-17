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
		
		if(!slist.isEmpty()) {
			
			m.addAttribute("cl", slist);
			
			return "success";
		}else {
			
			String str = "Invalid Username And Password...!";
			m.addAttribute("msg",str);
			
			return "login";
		}
		
		
	}
	
	@RequestMapping(value = "/edit")
	public String getSingleCustomer(@RequestParam int id , Model m) {
		
		Customer customer=customerService.getSingleCustomer(id);
		
		m.addAttribute("c", customer);
		
		return "edit";
		
	}

	@RequestMapping(value = "/update")
	public String updateCustomerData(@ModelAttribute Customer customer , Model m) {
		
		List<Customer> slist = customerService.getCheckUpdatedData(customer);
		
		m.addAttribute("cl", slist);
		
		return "success";
		
	}
	

	@RequestMapping(value = "/delete")
	public String deleteSingleCustomer(@ModelAttribute Customer customer , Model m) {
		
		List<Customer> slist = customerService.deleteSingleCustomer(customer);
		
		m.addAttribute("cl", slist);
		
		return "success";
		
	}

	
}
