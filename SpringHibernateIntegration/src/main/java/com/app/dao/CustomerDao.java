package com.app.dao;

import java.util.List;

import com.app.entity.Customer;
import com.app.entity.*;

public interface CustomerDao {

		public List<Customer> getCustomer();
		
		public void saveCustomer(Customer theCustomer);
		
		public Customer getCustomer(int theId);
		
		public void deleteCustomer(int theId);

	}


