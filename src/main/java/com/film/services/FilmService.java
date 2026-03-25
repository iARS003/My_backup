package com.film.services;

import com.film.entity.Film;
import com.film.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getFirst10Films() {
        return filmRepository.findAll(PageRequest.of(0, 10)).getContent();
    }

    // Get all films
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    // Get film by ID
    public Film getFilmById(Integer id) {
        return filmRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Film not found"));
    }

    // Pagination
    public List<Film> getFilmsWithPagination(int page, int size) {
        return filmRepository.findAll(PageRequest.of(page, size)).getContent();
    }



    public List<Film> getFilmsByLanguageName(String name) {
        return filmRepository.findByLanguage_Name(name);
    }

}