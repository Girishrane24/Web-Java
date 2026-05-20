package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;


// Data is annotation, which create getter, setter, constructor etc
@Data

public class Employee {
	private int id;
	private String firstName;
	private String password;
	private String email;
	private String gender;
	private String age;
	
	
}
