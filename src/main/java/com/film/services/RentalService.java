package com.film.services;

import com.film.dto.RentalDTO;
import com.film.entity.Rental;
import com.film.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService
{
    @Autowired
    private RentalRepository repo;

    public RentalService(RentalRepository repo)
    {
        this.repo = repo;
    }

    public List<RentalDTO> getAllRentals()
    {
        List<Rental> rentals = repo.findAll();
        return rentals.stream().map(this::convertToDTO).toList();
    }

    private RentalDTO convertToDTO(Rental r)
    {
        RentalDTO dto = new RentalDTO();

        dto.setRentalId(r.getRentalId());
        dto.setInventoryId(r.getInventory().getInventoryId());
        dto.setCustomerId(r.getCustomer().getCustomerId());
        dto.setStaffId(r.getStaff().getStaffId());
    }
//    r.getRentalDate().toString()
//    dto.setRentalDate(r.getRentalDate());
}
