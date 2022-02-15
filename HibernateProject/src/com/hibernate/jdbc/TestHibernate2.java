package com.hibernate.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class TestHibernate2 {

	public static void main(String[] args) 
	{
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		//session.save(new Student("girish","banglore","girishBanglore@gmail.com"));
     //	Student student = session.get(Student.class,6);
		List<Student> list = session.createQuery("from Student").getResultList();
     	for(Student student : list)
     	{
		System.out.println(student);
     	}
		session.getTransaction().commit();

	}

}
