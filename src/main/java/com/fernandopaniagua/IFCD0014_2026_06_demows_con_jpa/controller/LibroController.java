package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.controller;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.exception.LibroNotFoundException;
import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Libro;
import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.dto.LibroDTO;
import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.service.ILibroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Libro> create(@RequestBody Libro libro) {
        Libro nuevoLibro = this.libroService.save(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoLibro);
    }

    //READ ALL
    @GetMapping("/libros")
    public ResponseEntity<List<Libro>> readAll() {
        List<Libro> libros = this.libroService.findAll();
        return ResponseEntity.ok(libros);
    }

    //READ BY ID (con retorno objeto Libro)
    @GetMapping("/libros/{isbn}")
    public ResponseEntity<Libro> readById(@PathVariable String isbn) {
        try {
            Libro libro = this.libroService.findByISBN(isbn);
            return ResponseEntity.ok(libro);
        } catch (LibroNotFoundException lnfe) {
            return ResponseEntity.badRequest().body(null);//Devuelve un código http 400
        }
    }

    //READ BY ID (con retorno objeto LibroDTO)
    @GetMapping("/libros/exception/{isbn}")
    public ResponseEntity<LibroDTO> readLibroResponseById(@PathVariable String isbn) {
        try {
            Libro libro = this.libroService.findByISBN(isbn);
            return ResponseEntity.ok(new LibroDTO("OK", libro));
        } catch (LibroNotFoundException lnfe) {
            return ResponseEntity.ok(new LibroDTO("KO", null));
        }
    }

    //UPDATE
    @PutMapping("/libros")
    public ResponseEntity<Libro> update(@RequestBody Libro libro) {
        Libro libroActualizado = this.libroService.update(libro);
        return ResponseEntity.ok(libroActualizado);
    }

    //DELETE
    @DeleteMapping("/libros/{isbn}")
    public ResponseEntity<Libro> delete(@PathVariable String isbn) {
        try {
            Libro libro = this.libroService.findByISBN(isbn);
            this.libroService.delete(libro);
            return ResponseEntity.ok(libro);
        } catch (LibroNotFoundException lnfe) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    //FIND BY AUTOR
    @GetMapping("/libros/autor/{autor}")
    public ResponseEntity<List<Libro>> findByAutor(@PathVariable String autor) {
        List<Libro> libros = this.libroService.findByAutor(autor);
        return ResponseEntity.ok(libros);
    }

}