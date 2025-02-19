package com.bootcamp.avanade.rest.controllers.product;

import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.avanade.rest.models.ProductEntity;
import com.bootcamp.avanade.rest.services.ProductService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("product/")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("add")
    public ResponseEntity<ProductEntity> createProduct(@RequestBody ProductEntity product) throws Exception{
        return ResponseEntity.ok().body(service.createProduct(product));
    }

    @GetMapping("{id}")
    public Optional<ProductEntity> getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("list")
    public List<ProductEntity> getAll() {
        return service.findAll();
    }
}