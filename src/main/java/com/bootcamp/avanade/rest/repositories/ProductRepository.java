package com.bootcamp.avanade.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.avanade.rest.models.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long>{}
