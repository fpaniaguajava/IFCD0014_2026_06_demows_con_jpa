package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.controller;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Libro;
import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.services.ILibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibroController {
    private ILibroService libroService;
    public LibroController(ILibroService libroService) {
        this.libroService = libroService;
    }

    // CRUD (Create, Read, Update, Delete)

    //CREATE
    @PostMapping("/libros")
    public Libro save(@RequestBody Libro libro) {
        return this.libroService.save(libro);
    }

    //READ ALL
    @GetMapping("/libros")
    public List<Libro> findAll() {
        return this.libroService.findAll();
    }
}
