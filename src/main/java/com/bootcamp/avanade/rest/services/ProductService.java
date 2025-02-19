package com.bootcamp.avanade.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.avanade.rest.exceptions.product.ProductNullException;
import com.bootcamp.avanade.rest.exceptions.product.ProductPriceException;
import com.bootcamp.avanade.rest.models.ProductEntity;
import com.bootcamp.avanade.rest.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public ProductEntity createProduct(ProductEntity product) throws Exception{
        if(product.getName() == null || product.getPrice() == null) {
            throw new ProductNullException();
        }
        if(product.getPrice() <= 0) {
            throw new ProductPriceException();
        }
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

