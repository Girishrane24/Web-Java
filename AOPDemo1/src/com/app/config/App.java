package com.app.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.dao.AccountDao;
import com.app.dao.UserDao;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
		
		UserDao userDao = context.getBean("userDao", UserDao.class);
		
		accountDao.addAccount();
		accountDao.doWork();
		
		userDao.addAccount(10,20);
		userDao.doLogin("admin", "admin123");
		
		context.close();
	}
}
