package com.luv2code.springboot.thymealeafdemo.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymealeafdemo.entity.Employee;

@Controller
@RequestMapping("/employees")
public class DemoController 
{
	List<Employee> list ;
	
	@PostConstruct
	public void loadData()
	{
		list = new LinkedList<Employee>();
		list.add(new Employee(1,"prabhakar","D","pd@Gmail.com"));
		list.add(new Employee(2,"girish","k","gk@Gmail.com"));
		list.add(new Employee(3,"uday","g","uday@Gmail.com"));
		
	}
	@GetMapping("/list")
	public String listEmployees(Model model)
	{
		model.addAttribute("employees",list);
		return "list_employees";
	}


}
