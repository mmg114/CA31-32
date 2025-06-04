package com.ps.java_avanzado.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autor")
public class AutorController {


    @GetMapping
    public String getAutores(){
        return "Mauricio";
    }

    @PostMapping
    public String saveAutores(){
        return "Mauricio";
    }

    @PutMapping
    public String updateAutores(){
        return "Mauricio";
    }

    @DeleteMapping
    public String deleteAutor(){
        return "Mauricio";
    }
}
