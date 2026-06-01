package com.app.service;

import java.util.List;

import com.app.entity.Customer;
import com.app.entity.*;

public interface CustomerService {
	public List<Customer> getCustomer();
	
	public void saveCustomer(Customer theCustomer);
	
	public void getCustomer(int theId);
	
	public void deleteCustomer(int theId);

}
