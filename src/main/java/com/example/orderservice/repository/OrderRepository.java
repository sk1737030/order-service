package com.example.orderservice.repository;

import com.example.orderservice.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {

    Iterable<OrderEntity> findByUserId(String userId);

    OrderEntity findByOrderId(String orderId);
}
