package com.practice.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.entities.Designation;
import com.practice.entities.UserData;

public class Main {

	public static void main(String[] args) 
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(UserData.class)
				.addAnnotatedClass(Designation.class)
				.buildSessionFactory();

		
		Session ss = sf.getCurrentSession();
		
		ss.beginTransaction();
		
//		UserData uD=new UserData("shambho shankar","prabhakar bidu","24");
//		
//		ss.save(uD);
		
		
//		UserData uD = ss.get(UserData.class,"shambho shankar");
//		System.out.println(uD);
//		ss.delete(uD);
		
		Designation ds =  ss.get(Designation.class,18);
		
		System.out.println(ds);
		System.out.println(ds.getUserData());
		
		ss.getTransaction().commit();
	}

}
