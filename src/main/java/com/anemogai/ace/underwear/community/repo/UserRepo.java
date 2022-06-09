package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findUserByEmail(String email);
}
