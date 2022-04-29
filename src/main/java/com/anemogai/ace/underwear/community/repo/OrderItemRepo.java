package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepo extends CrudRepository<OrderItem, Long> {
}
