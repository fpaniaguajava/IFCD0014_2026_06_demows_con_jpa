package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Libro;
import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.services.ILibroService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Ifcd0014202606DemowsConJpaApplicationTests {
	@Autowired
	ILibroService iLibroService;


	@Test
	void findAllLibros(){
		List<Libro> libros = iLibroService.findAll();
		System.out.println(libros);
	}

}
