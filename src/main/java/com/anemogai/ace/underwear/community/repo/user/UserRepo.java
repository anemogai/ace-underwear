package com.anemogai.ace.underwear.community.repo.user;

import com.anemogai.ace.underwear.community.entity.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
}
