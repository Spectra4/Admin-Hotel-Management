package com.learning.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Bill {

	@Id
	private int bill_id;
	
	@JoinColumn
	@OneToOne(mappedBy = "bill")
	@JsonManagedReference
	private CustomerOrder cus_order;
	private String totalBill;
	
	@JoinColumn
	@OneToOne
	@JsonBackReference
	private Payment payment;
	
	@JoinColumn
	@OneToOne
	@JsonBackReference
	private Customer customer;
	@CreationTimestamp
	private LocalDateTime createon;
	public LocalDateTime getCreateon() {
		return createon;
	}
	public void setCreateon(LocalDateTime createon) {
		this.createon = createon;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getBill_id() {
		return bill_id;
	}
	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}
	public CustomerOrder getOrder() {
		return cus_order;
	}
	public void setOrder(CustomerOrder order) {
		this.cus_order = order;
	}
	public String getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(String totalBill) {
		this.totalBill = totalBill;
	}
}
