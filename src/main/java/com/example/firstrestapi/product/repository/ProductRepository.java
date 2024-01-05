package com.example.firstrestapi.product.repository;

import com.example.firstrestapi.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ProductRepository {
    protected final Map<Long,Product> map = new HashMap<>();
    protected long counter = 1; /* This is meant to count the iteration of the items in the hashmap*/
    // This is meant to save the product.
    public Product save(Product entity){
        setId(entity);
        return entity;
    }
    // This is a method meant to set the product Id to the index of the item in the Hashmap.
    private Product setId(Product entity){
        entity.setId(counter);
        map.put(counter,entity);
        counter++;
        return entity;
    }

    public Optional<Product> findById(Long id){
        return Optional.ofNullable(map.get(id));
    }
}
