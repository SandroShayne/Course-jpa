package com.devsuperior.course_jpa.repositories;
import com.devsuperior.course_jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface    ProductRepository extends JpaRepository<Product, Long> {

}
