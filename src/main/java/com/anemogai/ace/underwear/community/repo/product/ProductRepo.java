package com.anemogai.ace.underwear.community.repo.product;

import com.anemogai.ace.underwear.community.entity.product.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
}
