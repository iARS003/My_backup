package com.film.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

// Surrogate PK used instead of composite key.
// Unique constraint enforces the original PK (actor_id, film_id).
@Entity
@Table(name = "film_actor",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_film_actor",
                columnNames = {"actor_id", "film_id"}
        ))
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class FilmActor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // FK: film_actor.actor_id → actor.actor_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "actor_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_film_actor_actor"))
    private Actor actor;

    // FK: film_actor.film_id → film.film_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_film_actor_film"))
    private Film film;

    @Column(name = "last_update", insertable = false, updatable = false)
    private LocalDateTime lastUpdate;
}