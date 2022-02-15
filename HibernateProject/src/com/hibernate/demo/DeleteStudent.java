package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Student student = session.get(Student.class,2);
		
		System.out.println(student);
		session.delete(student);
		//session.createQuery("delete from Student where id = 3").executeUpdate();
		
		session.getTransaction().commit();
	}

}
