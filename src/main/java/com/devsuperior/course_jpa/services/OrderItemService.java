package com.devsuperior.course_jpa.services;

import com.devsuperior.course_jpa.entities.OrderItem;
import com.devsuperior.course_jpa.repositories.OrderItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository repository;

    public List<OrderItem> findAll(){
        return repository.findAll();
    }
    public OrderItem findById(Long id){
        Optional<OrderItem> obj = repository.findById(id);
        return obj.get();
    }

}
