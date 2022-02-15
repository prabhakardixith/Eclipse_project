package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First 
{
	@GetMapping("/")
	public String hi()
	{
		return "hello boys";
	}
	
	@GetMapping("/dev")
	public String dev()
	{
		return "hello devtools";
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello bacha";
	}

}
