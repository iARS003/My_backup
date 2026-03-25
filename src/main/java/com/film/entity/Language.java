package com.film.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    // One Language → Many Films
    @JsonManagedReference
    @OneToMany(mappedBy = "language", fetch = FetchType.LAZY)
    private List<Film> films;
}