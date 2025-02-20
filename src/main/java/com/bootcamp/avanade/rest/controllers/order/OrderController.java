package com.bootcamp.avanade.rest.controllers.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.avanade.rest.models.OrderEntity;
import com.bootcamp.avanade.rest.services.OrderService;

@RestController
@RequestMapping("order/")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("add")
    public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity orderEntity) {
        return ResponseEntity.ok().body(service.createOrder(orderEntity));
    }

    @GetMapping("{id}")
    public Optional<OrderEntity> getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("list")
    public List<OrderEntity> getAll() {
        return service.findAll();
    }
}
