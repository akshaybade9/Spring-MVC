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


	@Override
	public Customer getSigleCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDao.getSigleCustomer(id);
	}


	@Override
	public List<Customer> updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}


	@Override
	public List<Customer> deleteCustomer(int customer) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(customer);
	}

}
