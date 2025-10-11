package com.flipkart.service;

import com.flipkart.model.OrderItem;
import com.flipkart.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public void deleteAllOrderItems() {
        orderItemRepository.deleteAll();
    }
}
