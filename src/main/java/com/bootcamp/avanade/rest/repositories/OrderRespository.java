package com.bootcamp.avanade.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.avanade.rest.models.OrderEntity;

public interface OrderRespository extends JpaRepository<OrderEntity, Long>{}
