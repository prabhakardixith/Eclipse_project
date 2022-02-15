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

}
