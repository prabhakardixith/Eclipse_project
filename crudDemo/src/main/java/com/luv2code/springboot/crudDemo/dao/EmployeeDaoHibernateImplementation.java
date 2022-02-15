package com.luv2code.springboot.crudDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.crudDemo.entity.Employee;

@Repository
public class EmployeeDaoHibernateImplementation implements EmployeeDao {

	EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoHibernateImplementation(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Employee> findAll() 
	{
		Session session = entityManager.unwrap(Session.class);
		
		
		Query<Employee> theQuery = session.createQuery("from employee",Employee.class);
		
		List<Employee> list = theQuery.getResultList();
		return list;
	}

}
