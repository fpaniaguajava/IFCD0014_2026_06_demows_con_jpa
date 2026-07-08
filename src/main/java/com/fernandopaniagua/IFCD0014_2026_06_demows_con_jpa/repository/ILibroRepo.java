package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.repository;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILibroRepo extends JpaRepository<Libro, String> {
    public List<Libro> findByAutor(String autor);
    public List<Libro> findByTituloContaining(String cadena);
    public List<Libro> findByAutorContaining(String cadena);
}
