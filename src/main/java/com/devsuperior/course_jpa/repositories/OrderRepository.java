package com.devsuperior.course_jpa.repositories;
import com.devsuperior.course_jpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
