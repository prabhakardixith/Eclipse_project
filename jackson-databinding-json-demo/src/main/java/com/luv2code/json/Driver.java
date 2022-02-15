package com.luv2code.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) 
	{ 
	try
	{
		//create object mapper
		ObjectMapper mapper = new ObjectMapper();
		//read json file and map/convert to java pojo
		//data/sample-lite.json 
		Student std = mapper.readValue(new File("data/sample-full.json"), Student.class);  
		
		System.out.println(std);
		
		//print first name
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	}

}
