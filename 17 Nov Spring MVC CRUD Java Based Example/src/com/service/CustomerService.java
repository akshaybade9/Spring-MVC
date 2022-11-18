package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {

	
	void addCustomerData(Customer customer);
	
	List<Customer> getAllData(String uname , String pass);
	
	Customer getSigleCustomer(int id); 
	
	List<Customer> updateCustomer(Customer customer);
	
	List<Customer> deleteCustomer(int customer);
	
	
}


