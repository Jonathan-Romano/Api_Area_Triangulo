
package com.ejercicio.AreaTriangulo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class areaTrianguloController {
    
    
    @GetMapping ("/area")
    public String areaTriangulo(@RequestParam int base,
                             @RequestParam int altura){
        
        return "el area es: "+ (base * altura)/2;
    }
    
}
