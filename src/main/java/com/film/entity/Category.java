package com.film.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    // Many-to-Many with Film
    @ManyToMany(mappedBy = "categories")
    private List<Film> films;
}