package com.film.entity;

import jakarta.persistence.*;
<<<<<<< Updated upstream
=======
import lombok.*;
>>>>>>> Stashed changes
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "language")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

<<<<<<< Updated upstream


    @JsonManagedReference
    @OneToMany(mappedBy = "language")
    private List<Film> films;

    // Getters & Setters
    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
=======
    // Reverse: films using this as primary language
    @OneToMany(mappedBy = "language", fetch = FetchType.LAZY)
    private List<Film> films;

    // Reverse: films using this as original language
    @OneToMany(mappedBy = "originalLanguage", fetch = FetchType.LAZY)
    private List<Film> originalLanguageFilms;
>>>>>>> Stashed changes
}