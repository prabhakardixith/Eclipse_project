package com.hibernate.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class TestHibernate {

	public static void main(String[] args)
	{
		SessionFactory sf = new Configuration().configure("/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
//		session.save(new Student("girish","kumar","girishKumar@gmail.com"));
//		Student student = session.get(Student.class,4);
//		System.out.println(student);
		List<Student> list = session.createQuery("from Student where first_name='girish'").list();
		for(Student s:list)
		{
			System.out.println(s);
		}
		session.getTransaction().commit();
		

	}

}
