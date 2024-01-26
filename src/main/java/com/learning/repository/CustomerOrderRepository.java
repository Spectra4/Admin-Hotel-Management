package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.learning.entity.CustomerOrder;

import jakarta.transaction.Transactional;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

	@Transactional
	@Modifying
	@Query(value="DELETE Order WHERE a SET a.name= :name", nativeQuery=true)
	int deleteByName(@Param("name") String name);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE Order od SET od.item_name= :old_item WHERE od.item_name= :new_item", nativeQuery=true)
	int updateOrder(@Param("old_item") String old_item, @Param("new_item") String new_item);
}
