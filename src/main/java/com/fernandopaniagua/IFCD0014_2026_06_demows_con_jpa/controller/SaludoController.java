package com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.controller;

import com.fernandopaniagua.IFCD0014_2026_06_demows_con_jpa.model.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping("/saludo")
    public Saludo saludar(){
        Saludo saludo = new Saludo(1L, "Fernando");
        return saludo;
    }
}
