package com.ps.java_avanzado.controller;


import com.ps.java_avanzado.model.Autor;
import com.ps.java_avanzado.service.AutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// localhost:8080/autor/all
@RestController
@RequestMapping("/autor")
@RequiredArgsConstructor
public class AutorController {


    private final AutorService autorService;
    //GET localhost:8080/autor/all
    @GetMapping("/all")
    public List<Autor> getAutores(){
        List<Autor> autores =autorService.findAll();
        return autores;
    }
    //GET localhost:8080/autor/id
    @GetMapping("/{id}")
    public ResponseEntity<Autor> getAutoresById(@PathVariable Long id) {
        Autor autores =autorService.findById(id).get();
        return ResponseEntity.ok(autores);
    }
    //POST localhost:8080/autor
    // ->  body del mensaje deben poner un json con la informacion que quiere guardar
    // QUE INFORMACION La del autor SIN El ID
    @PostMapping
    public ResponseEntity<?> saveAutores(@RequestBody Autor autor) {

        try{
            return ResponseEntity.ok(autorService.save(autor));
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    //PUT localhost:8080/autor
    // ->  body del mensaje deben poner un json con la informacion que quiere guardar
    // QUE INFORMACION La del autor CON El ID que se quiere modificar
    @PutMapping
    public Autor updateAutores(@RequestBody Autor autor){
        return autorService.update(autor);
    }
    //DELETE localhost:8080/autor/id
    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable Long id) {
         autorService.delete(id);
    }
}
