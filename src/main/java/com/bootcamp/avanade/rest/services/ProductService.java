package com.bootcamp.avanade.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.avanade.rest.models.ProductEntity;
import com.bootcamp.avanade.rest.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public ProductEntity createProduct(ProductEntity product){
        return repository.save(product);
    }

    public List<ProductEntity> findAll() {
        return repository.findAll();
    }

    public Optional<ProductEntity> findById(Long id) {
        Optional<ProductEntity> OptionalProduct = repository.findById(id);

        if(OptionalProduct.isEmpty()) {
            System.out.println("Produto não encontrado");
        }

        return OptionalProduct;
    }

}

