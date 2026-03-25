package com.film.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

// Surrogate PK used instead of composite key.
// Unique constraint enforces the original PK (film_id, category_id).
@Entity
@Table(name = "film_category",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_film_category",
                columnNames = {"film_id", "category_id"}
        ))
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class FilmCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // FK: film_category.film_id → film.film_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_film_category_film"))
    private Film film;

    // FK: film_category.category_id → category.category_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_film_category_category"))
    private Category category;

    @Column(name = "last_update", insertable = false, updatable = false)
    private LocalDateTime lastUpdate;
}