package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Customer;
import com.app.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel)
	{
		List<Customer> theCustomer = customerService.getCustomer();
		System.out.println("theCustomers");
		theModel.addAttribute("listCust", theCustomer);
		return "list-customers";
		
	}
	
	
}
