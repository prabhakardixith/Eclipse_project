package com.practice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userData")
public class UserData 
{
	public UserData(){
		
	}
	@Id
	@Column(name="userId")
	private String uId;
	
	@Column(name="userName")
	private String uName;
	
	@Column(name="userAge")
	private String uAge;

	public UserData(String uId,String uName, String uAge) {
		this.uName = uName;
		this.uAge = uAge;
		this.uId=uId;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuAge() {
		return uAge;
	}

	public void setuAge(String uAge) {
		this.uAge = uAge;
	}

	@Override
	public String toString() {
		return "UserData [uId=" + uId + ", uName=" + uName + ", uAge=" + uAge + "]";
	}
	

}
