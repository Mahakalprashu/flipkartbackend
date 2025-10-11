package com.flipkart.controller;

import com.flipkart.model.Product;
import com.flipkart.repository.ProductRepository;
import com.flipkart.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // GET all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // POST a single product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // POST bulk products
    @PostMapping("/bulk")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productRepository.saveAll(products);
    }

    // DELETE all products safely
    @DeleteMapping("/all")
    public void deleteAllProducts() {
        orderItemRepository.deleteAll();
        productRepository.deleteAll();
    }
}
