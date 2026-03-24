package com.film.dto;

import jakarta.validation.constraints.*;
import lombok.*;

public class CityDto {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        @NotBlank(message = "City name must not be blank")
        @Size(max = 50, message = "City name must not exceed 50 characters")
        private String city;

        @NotNull(message = "Country ID must not be null")
        private Integer countryId;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PatchRequest {

        @Size(max = 50, message = "City name must not exceed 50 characters")
        private String  city;
        private Integer countryId;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Integer cityId;
        private String  city;

        // Embedded country info — avoids a separate country lookup call
        private Integer countryId;
        private String  country;
    }
}
