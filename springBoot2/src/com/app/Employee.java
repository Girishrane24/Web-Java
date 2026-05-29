package com.app;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private Date theDate;
	
	
	public Employee() 
	{
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Date getTheDate() {
		return theDate;
	}


	public void setTheDate(Date theDate) {
		this.theDate = theDate;
	}


	public Employee(int id, String name, double salary, Date theDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.theDate = theDate;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", theDate=" + theDate + "]";
	}
	
	
	

}
