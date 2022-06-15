package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.Size;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepo extends CrudRepository<Size, Integer> {
}
