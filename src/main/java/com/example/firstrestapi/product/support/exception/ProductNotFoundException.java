package com.example.firstrestapi.product.support.exception;

import com.example.firstrestapi.product.domain.Product;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super(String.format("Product with %d not found", id));
    }
}
