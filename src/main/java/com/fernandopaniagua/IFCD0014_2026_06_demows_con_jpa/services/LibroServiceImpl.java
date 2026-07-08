package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.services;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Libro;
import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.repository.ILibroRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements ILibroService{
    private ILibroRepo libroRepo;
    public LibroServiceImpl(ILibroRepo libroRepo) {
        this.libroRepo = libroRepo;
    }

    @Override
    public Libro save(Libro libro) {
        return this.libroRepo.save(libro);
    }

    @Override
    public List<Libro> findAll() {
        return this.libroRepo.findAll();
    }
}
