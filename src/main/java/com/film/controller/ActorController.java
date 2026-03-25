package com.film.controller;


import com.film.dto.ActorDTO;
import com.film.entity.Actor;
import com.film.services.ActorService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
 
@RestController
@RequestMapping("/api/v1/actors")
@RequiredArgsConstructor
public class ActorController {
 
    private final ActorService actorService;
 
    // GET /api/v1/actors
    @GetMapping
    public ResponseEntity<List<Actor>> getAllActors(
            @RequestParam(required = false) String lastName) {
        if (lastName != null) return ResponseEntity.ok(actorService.searchByLastName(lastName));
        return ResponseEntity.ok(actorService.getAllActors());
    }
 
    // GET /api/v1/actors/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Actor> getActorById(@PathVariable Integer id) {
        return ResponseEntity.ok(actorService.getActorById(id));
    }
 
    // POST /api/v1/actors
    @PostMapping
    public ResponseEntity<Actor> createActor(@Valid @RequestBody ActorDTO request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(actorService.createActor(request));
    }
 
    // PUT /api/v1/actors/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Actor> replaceActor(
            @PathVariable Integer id,
            @Valid @RequestBody ActorDTO request) {
        return ResponseEntity.ok(actorService.replaceActor(id, request));
    }
 
    // PATCH /api/v1/actors/{id}
    @PatchMapping("/{id}")
    public ResponseEntity<Actor> patchActor(
            @PathVariable Integer id,
            @RequestBody ActorDTO request) {
        return ResponseEntity.ok(actorService.patchActor(id, request));
    }
}
 