package com.app;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServices implements FortuneServices {

	
	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "Today was my Lucky Day";
	}
	
	public HappyFortuneServices()
	{
		System.out.println("In Happy Fortune Services Constructor");
	}
}
