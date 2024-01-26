package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer> {

}
