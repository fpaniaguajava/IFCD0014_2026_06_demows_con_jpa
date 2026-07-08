package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.services;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Libro;

import java.util.List;

public interface ILibroService {
    public Libro save(Libro libro);
    public List<Libro> findAll();
}
