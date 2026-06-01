package com.app.dao;

import org.springframework.stereotype.Component;

@Component	
public class AccountDao {
	public void addAccount() {
		System.out.println("Adding Account");
		
	}
	public void doWork() {
		System.out.println("In doWork of AccountDao");
	}
}
