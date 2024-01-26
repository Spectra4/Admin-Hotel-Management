package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Payment;
import com.learning.repository.PaymentRepository;

@RestController
public class PaymentController {

	@Autowired
	public PaymentRepository paymentRepo;
	
	@GetMapping("/get-payment-Details")
	public List<Payment> paymentDetails(){
		return paymentRepo.findAll();
	}
}
