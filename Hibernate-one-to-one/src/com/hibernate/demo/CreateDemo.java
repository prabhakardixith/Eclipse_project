package com.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetails;




public class CreateDemo {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.buildSessionFactory();
		
		Session ss = sf.openSession();
		
		ss.beginTransaction();

		Instructor instructor = new Instructor("prabhakar","dixith","pd@gmail.com");
		
		InstructorDetails instructorDetails = new InstructorDetails("JaiChidambar","Reading "); 
		
		instructor.setInstructorDetail(instructorDetails);
		
		System.out.println("saving  "+instructor);
		
		ss.save(instructor);
		
		ss.getTransaction().commit();

	}

}
