package com.app;

public class Human {
	
	private Heart heart;
	
	// Default constructor
	public Human()
	{
		System.out.println("Default constructor Human called");
	}

	public Human(Heart heart) {
		
		super();
		System.out.println("Parameterized constructor Human called");
		
		this.heart = heart;
	}

	
	
	public void setHeart(Heart heart) {
		System.out.println("Setter Called...");
		this.heart = heart;
	}

	@Override
	public String toString() {
		return "Human [heart=" + heart + "]";
	}
	
	
	public void pump()
	{
		if(heart != null)
		{
			heart.pumping();
		}
		else
		{
			System.out.println("you are dead!!!");
		}
	}
	
	

}
