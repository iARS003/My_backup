package com.film.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.film.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer > {
	List<Customer> findByUsingStore_StoreId(Integer storeId);
	List<Customer> findByUsingActive(Boolean active);
	Optional<Customer> findByUsingEmail (String email);
	List<Customer> findByUsingLastNameContainingIgnoreCase (String lastName);
}
