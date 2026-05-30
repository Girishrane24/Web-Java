package com.app;

public class App {

	public static void main(String[] args) {
		Human human = new Human();
		
		Heart heart1 = new Heart();
		
		Human heart = new Human(heart1);
		
	}
}
