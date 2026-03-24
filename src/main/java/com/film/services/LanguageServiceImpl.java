package com.film.services;

import com.film.dto.LanguageDTO;
import com.film.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public List<LanguageDTO> getAllLanguages() {
        return languageRepository.findAll()
                .stream()
                .map(lang -> new LanguageDTO(
                        lang.getLanguageId(),
                        lang.getName()
                ))
                .collect(Collectors.toList());
    }
}