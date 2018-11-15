package com.infogain.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infogain.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addEmployee(Employee emp) 
	{
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
	}

	@Override
	public List<Employee> listEmployees() {
		List<Employee> emplist=new ArrayList<Employee>();
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Employee");
		emplist=(ArrayList<Employee>)query.list();
		//return (List<Employee>)session.createCriteria(Employee.class).list();
		return emplist;
	}

}
