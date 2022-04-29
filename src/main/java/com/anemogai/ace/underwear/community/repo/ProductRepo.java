package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends PagingAndSortingRepository<Product, Long> {

}
