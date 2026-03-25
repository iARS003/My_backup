package com.film.services;

import com.film.dto.ActorDTO;
import com.film.entity.Actor;
import com.film.exception.ResourceNotFoundException;
import com.film.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;
 
@Service
@RequiredArgsConstructor
public class ActorService {
 
    private final ActorRepository actorRepository;
 
    public List<Actor> getAllActors() { 
    	return actorRepository.findAll(); }
 
    public Actor getActorById(Integer id) {
        return actorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Actor", "actorId", id));
    }
 
    public List<Actor> searchByLastName(String lastName) {
        return actorRepository.findByLastNameContainingIgnoreCase(lastName);
    }
 
    @Transactional
    public Actor createActor(ActorDTO request) {
        Actor actor = Actor.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .lastUpdate(LocalDateTime.now())
                .build();
        return actorRepository.save(actor);
    }
 
    @Transactional
    public Actor replaceActor(Integer id, ActorDTO request) {
        Actor actor = getActorById(id);
        actor.setFirstName(request.firstName());
        actor.setLastName(request.lastName());
        actor.setLastUpdate(LocalDateTime.now());
        return actorRepository.save(actor);
    }
 
    @Transactional
    public Actor patchActor(Integer id, ActorDTO request) {
        Actor actor = getActorById(id);
        if (request.firstName() != null) actor.setFirstName(request.firstName());
        if (request.lastName() != null)  actor.setLastName(request.lastName());
        actor.setLastUpdate(LocalDateTime.now());
        return actorRepository.save(actor);
    }
}
 