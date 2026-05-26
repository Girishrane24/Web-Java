package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App {
	
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetails.class)
								.buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		// Access Parameterized constructor
		InstructorDetails instructorDetails = new InstructorDetails("singing","girishjava.com");
		Instructor instructor = new Instructor("Girish","Rane","ranegirish24@gmail.com",instructorDetails);
		
		session.persist(instructor);
		
//		Instructor instructor1 = session.get(Instructor.class, 1);
//		System.out.println(instructor1);

		
		
		
		session.getTransaction().commit();
		
		session.close();
		
		session.close();
	
	
	}
}
