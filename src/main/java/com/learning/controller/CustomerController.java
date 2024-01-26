package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Customer;
import com.learning.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	public CustomerRepository customerRepo;
	
	@PostMapping("/add-customer")
	public String addCustomer(@RequestBody Customer customer) {
		customerRepo.save(customer);
		return "Customer with name "+customer.getCustomer_name() + " add successfully.";
	}
	
	@GetMapping("/get-customer")
	public List<Customer> getCustomer(){
		return customerRepo.findAll();
	}
}
