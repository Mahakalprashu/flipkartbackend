package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flipkart.model.Cart;
import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findByUserId(Long userId);
}
