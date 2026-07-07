package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.repository;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepo extends JpaRepository<Libro, String> {
}
