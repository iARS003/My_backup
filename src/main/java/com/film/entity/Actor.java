package com.film.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
 
@Entity
@Table(name = "actor")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Actor {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private Integer actorId;
 
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
 
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
 
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}