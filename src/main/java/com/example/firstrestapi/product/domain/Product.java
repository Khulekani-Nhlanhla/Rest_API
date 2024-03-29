package com.example.firstrestapi.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Product(){

    }
//    This a method meant to assign the name of the product
    public Product(String name){this.name = name;}

    // This method is responsible for retrieving the product id
    public Long getId(){return id;}
    // This method is for retrieving the product name.
    public String getName() {return name;}
    // This method is for setting or changing the product id
    public void setId(Long id){this.id = id;}
    // This method is for setting or changing the product name
    public void setName(String name){
        this.name = name;
    }
}
