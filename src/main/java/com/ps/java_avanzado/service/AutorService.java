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
        return null;
    }

    public List<Autor> findAll() {
        return null;
    }

    public void save(Autor autor) {

    }

    public void update(Autor autor) {

    }

    public void delete(Autor autor) {

    }


}
