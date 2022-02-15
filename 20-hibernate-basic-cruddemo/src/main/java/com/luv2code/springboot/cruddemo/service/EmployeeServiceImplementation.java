package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;


@Service
public class EmployeeServiceImplementation implements EmployeeService 
{
	@Autowired
	private EmployeeDAO employeeDao;

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee employeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.employeeById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);

	}

	@Override
	@Transactional
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployeeById(id);

	}

}
