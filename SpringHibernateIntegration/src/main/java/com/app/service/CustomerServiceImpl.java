package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CustomerDAOImpl;
import com.app.dao.CustomerDao;
import com.app.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDAO;
	
	// parameterizd constructor
	
	
	public CustomerServiceImpl(CustomerDAOImpl customerDAO) {
		super();
		this.customerDAO = customerDAO;
	}
		
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer();
	}



	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCustomer(int theId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub

	}

}
