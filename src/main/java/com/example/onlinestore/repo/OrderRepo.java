package com.example.onlinestore.repo;

import com.example.onlinestore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
