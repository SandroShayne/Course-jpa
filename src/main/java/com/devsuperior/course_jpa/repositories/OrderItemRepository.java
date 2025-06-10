package com.devsuperior.course_jpa.repositories;
import com.devsuperior.course_jpa.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
