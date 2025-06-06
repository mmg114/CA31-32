package com.ps.java_avanzado.service;

import com.ps.java_avanzado.model.Autor;
import com.ps.java_avanzado.repository.AutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AutorService {

    private  AutorRepository autorRepository;

    public Optional<Autor> findById(Long id) {
        return autorRepository.findById(id);
    }

    public List<Autor> findAll() {
      List<Autor> autores=  autorRepository.findAll();
        return autores;
    }

    public Autor save(Autor autor) throws RuntimeException {

        if(autor.getNombre()==null ){
            throw  new RuntimeException("Debes enviar el nombre del Autor");
        }
        if(autor.getNacionalidad()==null ){
            throw  new RuntimeException("Debes enviar la Nacionalidad del Autor");
        }
        return autorRepository.save(autor);
    }

    public Autor update(Autor autor) {
        return autorRepository.save(autor);
    }

    public void delete(Long id) {
        var autor= findById(id).get();
        if(autor!=null) {
            autorRepository.delete(autor);
        }
    }


}
