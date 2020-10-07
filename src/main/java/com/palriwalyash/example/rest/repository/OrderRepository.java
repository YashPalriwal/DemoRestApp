package com.palriwalyash.example.rest.repository;

import org.springframework.stereotype.Repository;

import com.palriwalyash.example.rest.domain.Order;

@Repository
public class OrderRepository extends InMemoryRepository<Order> {

	protected void updateIfExists(Order original, Order updated) {
		original.setDescription(updated.getDescription());
		original.setCostInCents(updated.getCostInCents());
		original.setComplete(updated.isComplete());
	}
}
