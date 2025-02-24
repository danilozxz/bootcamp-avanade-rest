package com.bootcamp.avanade.rest.controllers.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
    
}
