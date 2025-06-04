package com.ps.java_avanzado.controller;


import com.ps.java_avanzado.model.Autor;
import com.ps.java_avanzado.service.AutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/autor")
@RequiredArgsConstructor
public class AutorController {


    private final AutorService autorService;

    @GetMapping
    public List<Autor> getAutores(){
        List<Autor> autores =autorService.findAll();
        return autores;
    }

    @PostMapping
    public String saveAutores(){
        return "Mauricio";
    }

    @PutMapping
    public String updateAutores(){
        return "estaban";
    }

    @DeleteMapping
    public String deleteAutor(){
        return "Mauricio";
    }
}
