package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.service;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.exception.LibroNotFoundException;
import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Libro;

import java.util.List;

public interface ILibroService {
    public Libro save(Libro libro);
    public List<Libro> findAll();
    public Libro findByISBN(String isbn) throws LibroNotFoundException;
    public Libro update(Libro libro);
    public void delete(Libro libro);
    public List<Libro> findByAutor(String autor);
}
