package com.anemogai.ace.underwear.community.repo;

import com.anemogai.ace.underwear.community.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address, Long> {
}
