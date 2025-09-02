package com.semana2.dwi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ejercicio2 {
    @GetMapping("/sumar")
    public String sumar(@RequestParam int a, @RequestParam int b) {
        return "Resultado: " + (a + b);
    }
    @GetMapping("/restar")
    public String restar(@RequestParam int a, @RequestParam int b) {
        return "Resultado: " + (a - b);
    }
    @GetMapping("/multiplicar")
    public String multiplicar(@RequestParam int a, @RequestParam int b) {
        return "Resultado: " + (a * b);
    }
    @GetMapping("/dividir")
    public String dividir(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Error: División por cero no permitida.";
        }
        return "Resultado: " + (a / b);
    }
}
