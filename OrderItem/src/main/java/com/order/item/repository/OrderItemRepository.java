package com.order.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.item.entity.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository <OrderItem, Integer>{

}
