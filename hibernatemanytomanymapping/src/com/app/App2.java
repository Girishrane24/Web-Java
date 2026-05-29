package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Student;
public class App2 {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();

		Student student = new Student("girish","rane","girish@gmail.com");
		System.out.println("Saving student.....");
		session.persist(student);
		
		Course c1 = new Course("Microservices");
		Course c2 = new Course("SB");
		
//		student.add(c1);
//		student.add(c2);
		
		c1.add(student);
		c2.add(student);
		
		System.out.println("Saving course");
		
		
		session.persist(c1);
		session.persist(c2);
		
		
		// close all session
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}
}
