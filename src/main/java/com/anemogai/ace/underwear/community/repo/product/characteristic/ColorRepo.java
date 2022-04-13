package com.anemogai.ace.underwear.community.repo.product.characteristic;

import com.anemogai.ace.underwear.community.entity.product.characteristic.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepo extends CrudRepository<Color, Integer> {
}
