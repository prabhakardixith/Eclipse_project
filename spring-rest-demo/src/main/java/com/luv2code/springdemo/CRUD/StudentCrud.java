package com.luv2code.springdemo.CRUD;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/std")
 class StudentCrud 
 {
	List list ;
	
	@GetMapping("/student")
	public List allCustomers()
	{
		list.add(new Student("prabhakar","D"));
		return list;
	}
	
	@PostMapping("/student")
	public List addCustomers(@RequestBody Student student)
	{
		System.out.println(student);
		list.add(student);
		return list;
	}
	@PutMapping("/student")
	public List updateCustomers()
	{
		return null;
	}
	@DeleteMapping("/student")
	public List deleteCustomers(@PathVariable int id)
	{
		return null;
	}
	

}
