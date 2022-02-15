package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	// expose "/employees" and return list of employees
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		Employee emp = employeeService.employeeById(id);
		if (emp == null) {
			throw new RuntimeException("employee Id not Found " + id);
		}
		return emp;

	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		emp.setId(0);
		employeeService.save(emp);
		return emp;

	}

	@PutMapping("/employees")
	public Employee editEmployee(@RequestBody Employee emp) {
		employeeService.save(emp);
		return emp;

	}

	@DeleteMapping("/employees/{id}")
	public int deleteEmployee(@PathVariable int id) {
		Employee emp = employeeService.employeeById(id);
		if(emp == null)
		{
			throw new RuntimeException("employee id does not exist");
		}
		else {
		employeeService.deleteEmployeeById(id);
		}
		return id;
	}

}
