package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Customer;
import com.app.service.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel)
	{
		List<Customer> theCustomers = customerService.getCustomers();
		System.out.println(theCustomers);
		theModel.addAttribute("listCust", theCustomers);
		return "list-customers";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel)
	{
		Customer theCustomers = new Customer();
		theModel.addAttribute("customer",theCustomers);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,Model model)
	{
		Customer theCustomer = customerService.getCustomer(theId);
		model.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String showFormForDelete(@RequestParam("customerId") int theId)
	{
		customerService.deleteCustomer(theId);
//		model.addAttribute("customer", theCustomer);
		return "redirect:/customer/list";
	}
	
	

}
	
	
	
	
