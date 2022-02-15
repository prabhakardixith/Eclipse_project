package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;



public class CreateStudent {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session ss = sf.openSession();
		
		ss.beginTransaction();
		Student std =new Student("prabhakar","dixith","prabhakar@gmail.com");
		
		ss.save(std);
		
		ss.getTransaction().commit();

	}

}
