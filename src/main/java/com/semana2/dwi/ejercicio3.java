package com.semana2.dwi;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ejercicio3 {
    @GetMapping("/edad-futura/{nombre}/{edad}")
    public String edadFutura(@PathVariable String nombre, @PathVariable int edad) {
        return nombre + " en 5 años tendrás " + (edad+5) + " años.";
    }
}

