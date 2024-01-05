package com.example.firstrestapi.product.support;

import com.example.firstrestapi.product.api.ProductController;
import com.example.firstrestapi.product.api.request.ProductRequest;
import com.example.firstrestapi.product.api.request.UpdateProductRequest;
import com.example.firstrestapi.product.api.response.ProductResponse;
import com.example.firstrestapi.product.domain.Product;
import org.springframework.stereotype.Component;

// The Mapper is for the mapping of objects and their data.
@Component
public class ProductMapper {
    public Product toProduct(ProductRequest productRequest){
        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product){
        return new ProductResponse(product.getId(),product.getName());
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest){
        product.setName(updateProductRequest.getName());
        return product;
    }
}
