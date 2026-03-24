package com.film.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Year;
import java.time.LocalDateTime;
@Setter
@Getter
@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer film_id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Integer release_year;

    private BigDecimal rental_rate;

    private Integer length;

    private BigDecimal replacement_cost;

    private String rating;

    private String special_features;

    private LocalDateTime last_update;



    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;
    // Getters & Setters
}