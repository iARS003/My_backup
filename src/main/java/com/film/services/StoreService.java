package com.film.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.film.dto.StoreDTO;
import com.film.entity.Store;
import com.film.exception.StoreNotFoundException;
import com.film.repository.StoreRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreService {
	
	private final StoreRepository storeRepository;
	
	//1st one
	private StoreDTO.Response toResponse(Store store) {
		return StoreDTO.Response.builder()
				.storeId(store.getStoreId())
				.managerStaffId(store.getManagerStaffId())
				.lastUpdate(store.getLastUpdate())
				.build();
				
	}
	//2nd one
	private Store findOrThrow(Integer id) {
		
		return storeRepository.findById(id)
				.orElseThrow(() -> new StoreNotFoundException(id));
		
	}
	
	public StoreDTO.Response getStoreByUsingId(Integer id) {
		return toResponse(findOrThrow(id));
	}
	public List <StoreDTO.Response> getAllStores() {
		return storeRepository.findAll()
				.stream().map(this::toResponse).collect(Collectors.toList());
		
		
	}
}
