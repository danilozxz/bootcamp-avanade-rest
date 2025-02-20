package com.bootcamp.avanade.rest.models;

import java.time.LocalDateTime;
import java.util.Set;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;
    private LocalDateTime orderDate;
    private String status;

    @ManyToMany
    @Fetch(FetchMode.SELECT)
    private Set<ProductEntity> products;
}
