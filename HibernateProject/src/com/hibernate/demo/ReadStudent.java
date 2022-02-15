package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;



public class ReadStudent {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		
//		Session ss = sf.openSession();
//		
//		ss.beginTransaction();
		//Student std ;//=new Student("anushka","dixith","anushka@gmail.com");
//		
//		
//		System.out.println("tempStudent");
//		ss.save(std);
//		
//		System.out.println("commited");
//		ss.getTransaction().commit();
//		
		//primary key
//		System.out.println("primary key : "+ std.getId());
//		
		//new Session
		Session session = sf.openSession();
		session.beginTransaction();
		
		//retrieve student
		System.out.println("restrive primary key : "+ 1);
		Student gotStudent = session.get(Student.class,1);
		
		System.out.println("student record"+ gotStudent.toString());
		
		session.getTransaction().commit();
		
		//commit transactions
		

	}

}
