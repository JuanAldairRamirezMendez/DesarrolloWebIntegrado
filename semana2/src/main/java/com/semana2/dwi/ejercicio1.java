package com.semana2.dwi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ejercicio1 {

    @GetMapping("/saludo")
    public String saludo(@RequestParam(defaultValue = "Mundo") String nombre) {
        return "¡Hola, " + nombre + "!";
    }
}