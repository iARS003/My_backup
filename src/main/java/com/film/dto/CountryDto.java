package com.film.dto;

import jakarta.validation.constraints.*;
import lombok.*;

public class CountryDto {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        @NotBlank(message = "Country name must not be blank")
        @Size(max = 50, message = "Country name must not exceed 50 characters")
        private String country;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PatchRequest {

        @Size(max = 50, message = "Country name must not exceed 50 characters")
        private String country;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Integer countryId;
        private String  country;
    }
}

