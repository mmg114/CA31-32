package com.ps.java_avanzado.controller;


import com.ps.java_avanzado.model.Autor;
import com.ps.java_avanzado.service.AutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
@RequiredArgsConstructor
public class AutorController {


    private final AutorService autorService;

    @GetMapping("/all")
    public List<Autor> getAutores(){
        List<Autor> autores =autorService.findAll();
        return autores;
    }

    @GetMapping("/{id}")
    public Autor getAutoresById(@PathVariable Long id) {
        Autor autores =autorService.findById(id);
        return autores;
    }

    @PostMapping
    public Autor saveAutores(@RequestBody Autor autor) {
        return autorService.save(autor);
    }

    @PutMapping
    public Autor updateAutores(@RequestBody Autor autor){
        return autorService.update(autor);
    }

    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable Long id) {
         autorService.delete(id);
    }
}
