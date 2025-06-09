package com.devsuperior.course_jpa.services;
import com.devsuperior.course_jpa.entities.Product;
import com.devsuperior.course_jpa.repositories.CategoryRepository;
import com.devsuperior.course_jpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}


