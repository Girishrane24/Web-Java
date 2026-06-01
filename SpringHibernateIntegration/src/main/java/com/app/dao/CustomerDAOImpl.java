package com.app.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;



@Repository
public class CustomerDAOImpl implements CustomerDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomer(){
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> query = session.createQuery("from Customer",Customer.class);
		
		List<Customer> list = query.list();
		return list;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		session.merge(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		
	}

}
