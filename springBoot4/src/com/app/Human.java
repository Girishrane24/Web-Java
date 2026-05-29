package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	private Heart heart;
	public Human()
	{
		
	}

	
	public Human(Heart heart) {
		super();
		System.out.println("This is Parameterized constructor for Human");
		this.heart = heart;
	}
	
	public void setHeart(Heart heart) {
	
		System.out.println("this is setter of Heart");
		this.heart = heart;
	}
	
//	@Autowired
	public void inhectHeart(Heart heart)
	{
		System.out.println("User Define");
		this.heart = heart;
	}
	
	
	
	
}
