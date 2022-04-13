package com.anemogai.ace.underwear.community.repo.product.characteristic;

import com.anemogai.ace.underwear.community.entity.product.characteristic.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
