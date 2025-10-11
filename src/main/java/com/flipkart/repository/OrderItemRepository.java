package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flipkart.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
