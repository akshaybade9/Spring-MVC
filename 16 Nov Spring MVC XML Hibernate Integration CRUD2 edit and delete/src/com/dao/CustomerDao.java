package com.dao;

import java.util.List;

import com.model.Customer;

public interface CustomerDao {

	
	void addCustomerData(Customer customer);
	
	List<Customer> getAllData(String uname , String pass);

	Customer getSingleCustomer(int id);
	
	List<Customer> getCheckUpdatedData(Customer customer);
	
	List<Customer> deleteSingleCustomer(Customer customer);



}
