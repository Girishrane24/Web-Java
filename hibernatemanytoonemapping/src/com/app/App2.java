package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.Courses;

public class App2 {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Courses.class)
				.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();

		// define local variable 
		int id = 1;
		Instructor instructor = session.get(Instructor.class, id);
		
		Courses c1 = new Courses("java");
		Courses c2 = new Courses("SpringBoot");
		Courses c3 = new Courses("Spring");
		
		// add your courses to instructor table
		instructor.add(c1);
		instructor.add(c2);
		instructor.add(c3);
		
		
		// save data in the courses
		session.persist(c1);
		session.persist(c2);
		session.persist(c3);
		
		
		// close all session
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}
}
