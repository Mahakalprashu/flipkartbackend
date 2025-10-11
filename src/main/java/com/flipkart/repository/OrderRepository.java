package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flipkart.model.Order;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    // This works if Order has a User object
    List<Order> findByUser_Id(Long userId);
}
