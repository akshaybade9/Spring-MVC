package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerDao;
import com.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	
	@Override
	public void addCustomerData(Customer customer) {

		
		System.out.println("Customer Service Layer: " +customer);
		customerDao.addCustomerData(customer);
		
	}


	@Override
	public List<Customer> getAllData(String uname, String pass) {

		
		
		
		return customerDao.getAllData(uname, pass);
	}

}
