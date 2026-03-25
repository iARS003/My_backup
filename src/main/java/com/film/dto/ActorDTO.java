package com.film.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ActorDTO(
   @NotBlank(message = "First name is required") @Size(max = 45) 
   String firstName,
   @NotBlank(message = "Last name is required")  @Size(max = 45) 
   String lastName
) {}