package com.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	FortuneServices fortuneServices;
	
	public CricketCoach()
	{
		System.out.println("Default constructor of Cricket Coach");
	}
	
	public CricketCoach(@Qualifier("sadFortuneServices")FortuneServices fortuneServices) {
		super();
		System.out.println(" In Parameter Constructor of Cricket Coach");
		this.fortuneServices = fortuneServices;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily practice of cricket is a must";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "cricket Today your Luckey Day";
	}

}
