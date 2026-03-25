package com.film.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "film_text")
public class FilmText {

    @Id
    private Integer filmId;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;
}