package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;
	
	public Human()
	{
		
	}

	public Human(Heart heart) {
		super();
		System.out.println("In parameterized of Human");
		this.heart = heart;
	}
	@Autowired
	public void setHeart(Heart heart) {
		System.out.println("Setter Called");
		this.heart = heart;
	}
	
	@Autowired
	public void injectHeart(Heart heart) {
		System.out.println("User define");
		this.heart = heart;
	}
	
	
	
	
}
