package com.film.repository;

import com.film.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}