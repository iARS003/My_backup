package com.film.controller;

import com.film.entity.Film;
import com.film.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/first10")
    public List<Film> getFirst10Films() {
        return filmService.getFirst10Films();
    }
    // Get all films
    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }

    // Get film by ID
    @GetMapping("/{id}")
    public Film getFilmById(@PathVariable Integer id) {
        return filmService.getFilmById(id);
    }

    // Pagination
    @GetMapping("/page")
    public List<Film> getFilmsWithPagination(
            @RequestParam int page,
            @RequestParam int size) {
        return filmService.getFilmsWithPagination(page, size);
    }

}