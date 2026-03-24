package com.film.dto;

import jakarta.validation.constraints.*;
import lombok.*;

public class AddressDto {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {

        @NotBlank(message = "Address must not be blank")
        @Size(max = 50, message = "Address must not exceed 50 characters")
        private String address;

        @Size(max = 50, message = "Address2 must not exceed 50 characters")
        private String address2;

        @NotBlank(message = "District must not be blank")
        @Size(max = 20, message = "District must not exceed 20 characters")
        private String district;

        @NotNull(message = "City ID must not be null")
        private Integer cityId;

        @Size(max = 10, message = "Postal code must not exceed 10 characters")
        private String postalCode;

        @NotBlank(message = "Phone must not be blank")
        @Size(max = 20, message = "Phone must not exceed 20 characters")
        private String phone;

        @Pattern(
            regexp = "^POINT\\(-?\\d+(\\.\\d+)?\\s-?\\d+(\\.\\d+)?\\)$",
            message = "Location must be in WKT format: POINT(longitude latitude)"
        )
        private String location;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PatchRequest {

        @Size(max = 50, message = "Address must not exceed 50 characters")
        private String address;

        @Size(max = 50, message = "Address2 must not exceed 50 characters")
        private String address2;

        @Size(max = 20, message = "District must not exceed 20 characters")
        private String district;

        private Integer cityId;

        @Size(max = 10, message = "Postal code must not exceed 10 characters")
        private String postalCode;

        @Size(max = 20, message = "Phone must not exceed 20 characters")
        private String phone;

        @Pattern(
            regexp = "^POINT\\(-?\\d+(\\.\\d+)?\\s-?\\d+(\\.\\d+)?\\)$",
            message = "Location must be in WKT format: POINT(longitude latitude)"
        )
        private String location;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Short   addressId;
        private String  address;
        private String  address2;
        private String  district;
        private String  postalCode;
        private String  phone;
        private String  location;
        private Integer cityId;
        private String  city;
        private Integer countryId;
        private String  country;
    }
}
