package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends CrudRepository<Cart, Long>{
}
