package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
