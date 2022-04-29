package com.anemogai.ace.underwear.community.service.impl;

import com.anemogai.ace.underwear.community.entity.Product;
import com.anemogai.ace.underwear.community.repo.ProductRepo;
import com.anemogai.ace.underwear.community.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    @Transactional
    public Page<Product> getAllProducts() {
        Pageable pageable = PageRequest.of(0, 10);
        return productRepo.findAll(pageable);
    }

    @Override
    @Transactional
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }
}
