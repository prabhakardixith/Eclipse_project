package com.practice.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Designation")
public class Designation 
{
//	dId, salary, designation, userID
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="dId")
	private int dId;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="designation")
	private String designation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userID")
	private UserData userData;

	public Designation() {
	}

	public Designation(int salary, String designation) {
		this.salary = salary;
		this.designation = designation;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	@Override
	public String toString() {
		return "Designation [dId=" + dId + ", salary=" + salary + ", designation=" + designation + ", userData="
				+ userData + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
