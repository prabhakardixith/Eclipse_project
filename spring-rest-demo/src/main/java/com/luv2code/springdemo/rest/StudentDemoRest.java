package com.luv2code.springdemo.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luv2code.springdemo.entity.Student;

@RequestMapping("/api")
@RestController
public class StudentDemoRest {
	List<Student> list;
	Student student;

	@PostConstruct
	public void addData() {
		list = new ArrayList<Student>();
		list.add(new Student("prabhakar", "dixith"));
		list.add(new Student("anushka", "dixith"));
		list.add(new Student("uday", "garu"));
	}

	@GetMapping("/students")
	public List getStudents() {
		addData();
		return list;
	}
	
	//get Specific Student

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) 
	{
		
		return list.get(id);
	}
	
	@GetMapping("/studentById")
	public Student getStudentByIdUsingRequestParam(@RequestParam int id) 
	{
		if((id >= list.size()) || (id<0))
		{
			throw new StudentNotFoundException("student id not found "+id);
		}
		return list.get(id);
	}
	
	@PostMapping("/addStudent")
	public List addStudent(@RequestBody String students)
	{
//		Student std = new ObjectMapper().convertValue(students, Student.class);
		System.out.println(students);
//		list.add(std);
		return list;
	}
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handlerException(StudentNotFoundException exc)
	{
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTime(System.currentTimeMillis());
		
		return new ResponseEntity<StudentErrorResponse>(error,HttpStatus.NOT_FOUND);
		
	}

}
