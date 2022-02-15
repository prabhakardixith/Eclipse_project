package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value( "prabhakar")
private String fName;
private String lName = "dixith";
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
public Student()
{
	
}

}
