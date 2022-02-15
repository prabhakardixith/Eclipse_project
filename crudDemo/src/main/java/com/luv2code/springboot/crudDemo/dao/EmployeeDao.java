package com.luv2code.springboot.crudDemo.dao;

import java.util.List;

import com.luv2code.springboot.crudDemo.entity.Employee;

public interface EmployeeDao 
{
	public List<Employee> findAll();
	

}
