package com.inbev.tech.repository;


import com.inbev.tech.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>{
    // pode adicionar métodos personalizados de consulta, se necessário
}