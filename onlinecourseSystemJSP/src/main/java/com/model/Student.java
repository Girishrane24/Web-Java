package com.model;

public class Student {
	
	private int id;
    private String fullname;
    private String email;
    private String password;
	public Student(String fullname, String email, String password) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + "]";
	}
    
    
}
