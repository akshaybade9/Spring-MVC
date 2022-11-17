package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeServiceDaoImpl implements EmployeeServiceDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void addEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub

		System.out.println("In Dao Layer" + " " + employee);
		
		Session session = sf.openSession();
		
		session.save(employee);
		
		session.beginTransaction().commit();

	}

	@Override
	public List<Employee> getAllEmployeeList(String uname, String pass) {
		// TODO Auto-generated method stub
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		Session session = sf.openSession();
		
		if(uname.equals("admin") && pass.equals("admin")) {
		Query<Employee> query = session.createQuery("from Employee");
		
		list = query.getResultList();
		
		
		}
		
		
		return list;
	}

}
