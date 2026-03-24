package com.film.controller;

import com.film.dto.LanguageDTO;
import com.film.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping
    public List<LanguageDTO> getAllLanguages() {
        return languageService.getAllLanguages();
    }
}
