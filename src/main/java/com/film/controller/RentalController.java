package com.film.controller;

import com.film.dto.RentalDTO;
import com.film.services.RentalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rentals")
public class RentalController
{
    private final RentalService service;

    public RentalController(RentalService service) {
        this.service = service;
    }

    @GetMapping
    public List<RentalDTO> getAllRentals() {
        return service.getAllRentals();
    }
}
