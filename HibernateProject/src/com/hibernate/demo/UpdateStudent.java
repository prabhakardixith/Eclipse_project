package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Student student  = session.get(Student.class,6);
		
		student.setfName("uday");
		
		session.getTransaction().commit();
		
	}

}
