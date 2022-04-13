package com.anemogai.ace.underwear.community.repo.cart;

import com.anemogai.ace.underwear.community.entity.cart.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends CrudRepository<Cart, Long>{
}
