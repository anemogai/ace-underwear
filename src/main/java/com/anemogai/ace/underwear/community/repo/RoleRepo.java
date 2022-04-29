package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends CrudRepository<Role, Integer> {
}
