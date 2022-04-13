package com.anemogai.ace.underwear.community.repo.user.address;

import com.anemogai.ace.underwear.community.entity.user.address.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address, Long> {
}
