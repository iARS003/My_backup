package com.film.entity;

import java.io.Serializable;
import java.security.Timestamp;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Embeddable
@Entity
@Table(name="film_category")
public class FilmCategory implements Serializable {
    private Film filmId;
    @Id
    private Integer categoryId;
    private Timestamp lastupdate;
}