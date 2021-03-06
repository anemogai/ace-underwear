package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {
}
