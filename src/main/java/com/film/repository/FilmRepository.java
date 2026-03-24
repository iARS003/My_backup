package com.film.repository;

import com.film.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {



    List<Film> findByLanguage_Name(String name);
}