package com.example.lab8pai.repositories;

import com.example.lab8pai.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository <Address, Long> {
}
