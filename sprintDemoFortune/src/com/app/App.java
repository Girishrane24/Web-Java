package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Coach coach = context.getBean(Coach.class, "TenniseCoach");
		
		System.out.println("Daily Workout : " + coach.getDailyWorkout());
		System.out.println("Fortune : " + coach.getDailyFortune());
		
		Coach coach1 = context.getBean("tennisCoach",Coach.class);
		Coach coach2 = context.getBean("tenniseCoach",Coach.class);
		
		if(coach1 == coach2)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		
	}
}
