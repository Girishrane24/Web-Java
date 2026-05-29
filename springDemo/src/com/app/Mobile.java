package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		/*
		Jio jio = new Jio();
		jio.calling();
		jio.data();
		
		Vodafone voda = new Vodafone();
		voda.calling();
		voda.data();
		
		
		Sim sim = new Jio(); // polymorphic reference
		sim.calling();
		sim.data();
		*/
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Jio j = context.getBean(Jio.class, "jio");
		j.calling();
		j.data();
		
		
	}
}
