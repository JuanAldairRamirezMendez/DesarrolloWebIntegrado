package com.semana2.dwi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntornoController {
    @Value("${app.mensaje}")
    private String mensaje;

    @GetMapping("/entorno")
    public String mostrarEntorno(){
        return mensaje;
    }

}
