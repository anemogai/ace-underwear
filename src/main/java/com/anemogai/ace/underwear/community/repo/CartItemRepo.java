package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepo extends CrudRepository<CartItem, Long> {
}
