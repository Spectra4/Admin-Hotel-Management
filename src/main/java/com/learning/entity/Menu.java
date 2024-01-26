package com.learning.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Component
@Entity
public class Menu {

	@Id
	private int item_id;
	private String item_name;
	private int amount;
	
	@JoinColumn
	@OneToOne
	@JsonBackReference
	private CustomerOrder cus_order;
	public CustomerOrder getOrder() {
		return cus_order;
	}
	public void setOrder(CustomerOrder order) {
		this.cus_order = order;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
