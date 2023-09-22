package com.inbev.tech.service;

import com.inbev.tech.model.Product;
import com.inbev.tech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    // Outros métodos de serviço, como buscar, atualizar e exluir produtos

}
