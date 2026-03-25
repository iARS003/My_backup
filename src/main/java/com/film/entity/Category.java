package com.film.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "category")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "name", nullable = false, length = 25)
    private String name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    // Reverse: all FilmCategory join records for this category
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<FilmCategory> filmCategories;
}