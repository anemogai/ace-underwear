package com.anemogai.ace.underwear.community.service;

import com.anemogai.ace.underwear.community.entity.Product;
import org.springframework.data.domain.Page;

public interface ProductService{

    Page<Product> getAllProducts();

    Product addProduct(Product product);
}
