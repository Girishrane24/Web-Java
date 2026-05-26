package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Student;

public class App {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. Get session Factory
//		SessionFactory factory = new Configuration()
//				.configure("hibernate.cfg.xml")
//				.addAnnotatedClass(Student.class)
//				.buildSessionFactory();
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// 2. Get Session
		Session session = factory.openSession();
		
		// 3. Begin a transaction
		session.beginTransaction();
		
		// a. Persist student
//		Student s = new Student();
//		s.setFirstName("Girish");
//		s.setLastName("Rane");
//		s.setEmail("ranegirish24@gmail.com");
//		
//		session.persist(s);
//		
		
		//b. get student on basis of their ID : 
//		System.out.println("Enter student ID: ");
//		int id = scanner.nextInt();
//		Student student = session.get(Student.class, id);
//		
//		System.out.println(student);
//		
		
		// c. Update student
//		System.out.println("Enter ID");
//		int id = scanner.nextInt();
//		
//		Student student = session.get(Student.class, id);
//		
//		student.setEmail("girish@gmail.com");
//		session.merge(student);
//		
//		
		// d . delete statement
		System.out.println("Enter ID : ");
		int id = scanner.nextInt();
		Student student = session.get(Student.class, id);
		session.remove(student);
		
		
		
		
		
		// 4. commit Transaction
		session.getTransaction().commit();
		
		// 5. close the session
		session.close();
		
		// 6. close the factory
		factory.close();
		scanner.close();
	}
}
