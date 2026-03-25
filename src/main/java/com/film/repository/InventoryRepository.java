package com.film.repository;

import com.film.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository <Inventory,Integer>
{

}
