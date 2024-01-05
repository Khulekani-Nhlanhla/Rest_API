package com.example.firstrestapi.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ProductRequest {
    private final String name;
    

    // This a method meant to specify the constructor meant to be used during deserialization specifically product name.
    @JsonCreator
    public ProductRequest(String name){this.name = name;}

    public String getName(){return name;}

}
