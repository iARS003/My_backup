package com.film.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RentalDTO
{
    private Integer rentalId;

    @NotNull(message = "Inventory Id is required")
    private Integer inventoryId;
    @NotNull(message = "Inventory Id is required")
    private Integer customerId;
    @NotNull(message = "Inventory Id is required")
    private Integer staffId;
    @NotNull(message = "Inventory Id is required")
    private String rentalDate;
    private String returnDate;

}
