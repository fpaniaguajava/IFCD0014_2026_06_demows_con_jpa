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

    //CREATE
    @Override
    public Libro save(Libro libro) {
        return this.libroRepo.save(libro);
    }

    //READ
    @Override
    public List<Libro> findAll() {
        return this.libroRepo.findAll();
    }

    @Override
    public Libro findByISBN(String isbn) throws LibroNotFoundException {
        Libro libro = this.libroRepo.findById(isbn).orElseThrow(LibroNotFoundException::new);
        return libro;
    }

    //UPDATE
    @Override
    public Libro update(Libro libro) {
        return this.libroRepo.save(libro);
    }

    //DELETE
    @Override
    public void delete(Libro libro) {
        this.libroRepo.delete(libro);
    }

    //FIND BY AUTOR
    @Override
    public List<Libro> findByAutor(String autor) {
        return this.libroRepo.findByAutor(autor);
    }


}
