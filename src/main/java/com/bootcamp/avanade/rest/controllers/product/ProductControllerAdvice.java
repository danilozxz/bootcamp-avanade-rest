package com.bootcamp.avanade.rest.controllers.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bootcamp.avanade.rest.exceptions.product.ProductNullException;
import com.bootcamp.avanade.rest.exceptions.product.ProductPriceException;

@ControllerAdvice
public class ProductControllerAdvice extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(ProductNullException.class)
    public ResponseEntity<Object> catchNullError() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Verifique se os campos estão preenchidos corretamente");
    }

    @ExceptionHandler(ProductPriceException.class)
    public ResponseEntity<Object> catchPriceError() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Verifique o preço do produto");
    }
}
