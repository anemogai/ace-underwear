package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
