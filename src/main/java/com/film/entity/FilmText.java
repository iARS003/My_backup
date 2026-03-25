package com.film.entity;

import jakarta.persistence.*;
import lombok.*;

// film_text is populated by DB triggers on film insert/update/delete.
// No JPA FK constraint — filmId mirrors film.film_id by value only.
@Entity
@Table(name = "film_text")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class FilmText {

    @Id
    @Column(name = "film_id")
    private Integer filmId;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
}