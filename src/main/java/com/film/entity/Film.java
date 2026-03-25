package com.film.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.Year;
import java.time.LocalDateTime;
<<<<<<< Updated upstream
@Setter
@Getter
=======
import java.util.List;

>>>>>>> Stashed changes
@Entity
@Table(name = "film")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer film_id;

<<<<<<< Updated upstream
=======
    @Column(name = "title", nullable = false, length = 128)
>>>>>>> Stashed changes
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Integer release_year;

<<<<<<< Updated upstream
    private BigDecimal rental_rate;
=======
    // FK: film.language_id → language.language_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_film_language"))
    private Language language;

    // FK: film.original_language_id → language.language_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "original_language_id",
            foreignKey = @ForeignKey(name = "fk_film_language_original"))
    private Language originalLanguage;

    @Column(name = "rental_duration", nullable = false)
    private Short rentalDuration;

    @Column(name = "rental_rate", nullable = false)
    private BigDecimal rentalRate;
>>>>>>> Stashed changes

    private Integer length;

<<<<<<< Updated upstream
    private BigDecimal replacement_cost;
=======
    @Column(name = "replacement_cost", nullable = false)
    private BigDecimal replacementCost;
>>>>>>> Stashed changes

    private String rating;

    private String special_features;

    private LocalDateTime last_update;



<<<<<<< Updated upstream
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;
    // Getters & Setters
=======
    // Reverse: all FilmActor join records for this film
    @OneToMany(mappedBy = "film", fetch = FetchType.LAZY)
    private List<FilmActor> filmActors;

    // Reverse: all FilmCategory join records for this film
    @OneToMany(mappedBy = "film", fetch = FetchType.LAZY)
    private List<FilmCategory> filmCategories;
>>>>>>> Stashed changes
}