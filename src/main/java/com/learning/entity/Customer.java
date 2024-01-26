package com.learning.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	private int customer_id;
	private String customer_name;
	@CreationTimestamp
	private LocalDateTime createon;
	
	public LocalDateTime getCreateon() {
		return createon;
	}
	public void setCreateon(LocalDateTime createon) {
		this.createon = createon;
	}
	@JoinColumn
	@OneToOne(mappedBy = "customer")
	@JsonManagedReference
	private Bill bill;
	
	@JoinColumn
	@OneToOne(mappedBy = "customer")
	@JsonManagedReference
	private CustomerOrder corder;
	
	@JoinColumn
	@OneToOne(mappedBy = "customer")
	@JsonManagedReference
	private Payment payment;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public CustomerOrder getOrder() {
		return corder;
	}
	public void setOrder(CustomerOrder order) {
		this.corder = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
