package com.luv2code.springdemo.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
private String fName ;
private String lName ;
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
@Override
public String toString() {
	return "Student [fName=" + fName + ", lName=" + lName + "]";
}
public void setlName(String lName) {
	this.lName = lName;
}

public Student(String fName, String lName) {
	this.fName = fName;
	this.lName = lName;
}


}
