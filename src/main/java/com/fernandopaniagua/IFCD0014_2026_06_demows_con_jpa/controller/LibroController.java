package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.controller;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Libro;
import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.services.ILibroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibroController {
    private ILibroService libroService;
    public LibroController(ILibroService libroService) {
        this.libroService = libroService;
    }

    @PostMapping("/libro")
    public Libro save(@RequestBody Libro libro) {
        return this.libroService.save(libro);
    }
}
