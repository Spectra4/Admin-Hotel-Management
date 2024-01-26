package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.CustomerOrder;
import com.learning.repository.CustomerOrderRepository;

@RestController
public class CustomerOrderController {

	@Autowired
	public CustomerOrderRepository customerorderrepo;
		
	@PostMapping("/save-order")
	public String saveOrder(@RequestBody CustomerOrder customerorder) {
		customerorderrepo.save(customerorder);
		return "Customer Order Save Successfully.";
	}
	
	@GetMapping("/get-order")
	public List<CustomerOrder> getOrderDetails() {
		return customerorderrepo.findAll();
	}
	
	@DeleteMapping("/delete-by-name")
	public String deleteByName(@RequestParam ("name") String name) {
		customerorderrepo.deleteByName(name);
		return"Customer Order Delete Successfully.";
	}
	@PutMapping("/update-order")
	public String updateOrder(@RequestParam("old_item") String old_item, @RequestParam("new_item") String new_item) {
		customerorderrepo.updateOrder(old_item, new_item);
		return "Customer Order Update Successfully.";
	}
}
