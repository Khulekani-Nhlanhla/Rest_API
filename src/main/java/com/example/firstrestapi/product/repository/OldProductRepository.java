package com.example.firstrestapi.product.repository;

import com.example.firstrestapi.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class OldProductRepository {
    protected final Map<Long,Product> map = new HashMap<>();
    protected long counter = 1; /* This is meant to count the iteration of the items in the hashmap*/
    // This is meant to save the product.
    public Product save(Product entity){
        setId(entity);
        return entity;
    }
    // This is a method meant to set the product Id to the index of the item in the Hashmap.
    private Product setId(Product entity){
        if (entity.getId() != null){
            map.put(entity.getId(),entity);
        }else{
            entity.setId(counter);
            map.put(counter,entity);
            counter++;
        }
        return entity;
    }

    public Optional<Product> findById(Long id){
        return Optional.ofNullable(map.get(id));
    }
    public List<Product> findAll(){
        return new ArrayList<>(map.values());
    }

    public void deleteById(Long id){
        map.remove(id);
    }
}
