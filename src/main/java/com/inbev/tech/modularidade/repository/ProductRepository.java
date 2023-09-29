package com.inbev.tech.modularidade.repository;


import com.inbev.tech.modularidade.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>{
    // pode adicionar métodos personalizados de consulta, se necessário
}