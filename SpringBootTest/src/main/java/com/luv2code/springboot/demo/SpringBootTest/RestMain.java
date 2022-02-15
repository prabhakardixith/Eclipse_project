package com.luv2code.springboot.demo.SpringBootTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMain 
{
	@Value("${person.fName}")
	String fName;
	
	@Value("${person.lName}")
	String lName;
	
	@GetMapping(path="/")
	public String hi()
	{
		return fName;
	}
	
	@GetMapping(path="/hello")
	public String hello()
	{
		return lName;
	}

}
