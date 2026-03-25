package com.film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.film.entity.FilmCategory;

@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategory, Integer> {}
