package com.luv2code.springboot.crudDemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.crudDemo.dao.EmployeeDao;
import com.luv2code.springboot.crudDemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController 
{
	@Autowired
	private EmployeeDao employeeDao;
	
	@GetMapping("/")
	public List<Employee> All()
	{
		List list = employeeDao.findAll();
		return list;
	}

}
