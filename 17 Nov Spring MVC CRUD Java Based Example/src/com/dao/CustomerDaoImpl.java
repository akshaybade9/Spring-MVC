package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void addCustomerData(Customer customer) {

		System.out.println("In Dao Layer : " + customer);

		Session session = sf.openSession();

		session.save(customer);
		session.beginTransaction().commit();

	}

	@Override
	public List<Customer> getAllData(String uname, String pass) {
		// TODO Auto-generated method stub
		
		Session session = sf.openSession();
		
		List<Customer> list = new ArrayList<Customer>();
		
		if(uname.equals("admin") && pass.equals("admin")) {
			
			Query<Customer> query = session.createQuery("from Customer");
			
			list=query.getResultList();
			return list;
			
		}else {
			try {
			Query<Customer> query = session.createQuery("from Customer where uname=:un and pass=:ps");
			query.setParameter("un", uname);
			query.setParameter("ps", pass);
			Customer customer = query.getSingleResult();
			list.add(customer);
			return list;
			} catch (NoResultException e) {
				// TODO: handle exception
				System.out.println("Invalid Username and Password...!");
			}
			
			return list;
		}
	}

	@Override
	public Customer getSigleCustomer(int id) {
		// TODO Auto-generated method stub

		Session session = sf.openSession();

		Customer customer = session.get(Customer.class, id);

		return customer;
	}

	@Override
	public List<Customer> updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

		Session session = sf.openSession();
		session.beginTransaction();
		session.update(customer);

		session.getTransaction().commit();

		Query<Customer> q = session.createQuery("from Customer");
		List<Customer> list = q.getResultList();

		return list;
	}

	@Override
	public List<Customer> deleteCustomer(int customer) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Customer customer1 = session.get(Customer.class, customer);
		session.delete(customer1);
		session.beginTransaction().commit();
		Query<Customer> query = session.createQuery("from Customer");
		List<Customer> list = query.getResultList();
		return list;
	}

}
