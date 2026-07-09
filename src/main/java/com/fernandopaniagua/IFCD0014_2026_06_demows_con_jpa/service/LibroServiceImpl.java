package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.service;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.exception.LibroNotFoundException;
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

    @Override
    public Libro findByISBN(String isbn) throws LibroNotFoundException {
        Libro libro = this.libroRepo.findById(isbn).orElseThrow(LibroNotFoundException::new);
        return libro;
    }

    @Override
    public Libro update(Libro libro) {
        return this.libroRepo.save(libro);
    }

    @Override
    public void delete(Libro libro) {
        this.libroRepo.delete(libro);
    }

    @Override
    public List<Libro> findByAutor(String autor) {
        return this.libroRepo.findByAutor(autor);
    }


}
