package com.film.repository;

import com.film.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    Optional<Country> findByCountryIgnoreCase(String country);

    boolean existsByCountryIgnoreCase(String country);
}
