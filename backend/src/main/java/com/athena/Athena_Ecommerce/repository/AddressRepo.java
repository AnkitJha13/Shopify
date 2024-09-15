package com.athena.Athena_Ecommerce.repository;

import com.athena.Athena_Ecommerce.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}