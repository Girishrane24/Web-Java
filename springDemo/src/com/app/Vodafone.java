package com.app;

public class Vodafone implements Sim{

	// default constructor
	public Vodafone()
	{
		// no parameter, no operation
	}
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("This is Vodafone calling");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("This is Vodafone Data");
		
	}

}
