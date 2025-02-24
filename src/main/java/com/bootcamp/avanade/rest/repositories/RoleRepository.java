package com.bootcamp.avanade.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.avanade.rest.models.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long>{
    RoleEntity findByName(String name);
}
