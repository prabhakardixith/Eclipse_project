package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Autowired
	Student student;

	public void prints() {
		System.out.println(student);
	}
}
