package com.ps.java_avanzado.service;

import com.ps.java_avanzado.model.Autor;
import com.ps.java_avanzado.repository.AutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AutorService {

    private  AutorRepository autorRepository;

    public Autor findById(Long id) {
        return autorRepository.findById(id).get();
    }

    public List<Autor> findAll() {
      List<Autor> autores=  autorRepository.findAll();
        return autores;
    }

    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor update(Autor autor) {
        return autorRepository.save(autor);
    }

    public void delete(Long id) {
        var autor= findById(id);
        if(autor!=null) {
            autorRepository.delete(autor);
        }
    }


}
