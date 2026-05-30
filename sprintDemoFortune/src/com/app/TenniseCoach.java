package com.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TenniseCoach implements Coach {
	FortuneServices fortuneServices;
	
	public TenniseCoach()
	{
		
	}
	
	
	public TenniseCoach(@Qualifier("happyFortuneService")FortuneServices fortuneServices) {
		super();
		System.out.println("This is parameterized Constructor of Tennise");
		this.fortuneServices = fortuneServices;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Tennise is good game ";
	}

}
