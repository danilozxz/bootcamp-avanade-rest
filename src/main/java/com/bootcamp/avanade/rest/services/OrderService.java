package com.bootcamp.avanade.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.avanade.rest.models.OrderEntity;
import com.bootcamp.avanade.rest.repositories.OrderRespository;

@Service
public class OrderService {
    @Autowired
    private OrderRespository respository;

    public OrderEntity createOrder(OrderEntity order) {
        return respository.save(order);
    }

    public List<OrderEntity> findAll() {
        return respository.findAll();
    }

    public Optional<OrderEntity> findById(Long id) {
        Optional<OrderEntity> optionalOrder = respository.findById(id);

        if(optionalOrder.isEmpty()) {
            System.out.println("Esse pedido não foi encontrado");
        }

       return optionalOrder; 
    }
}
