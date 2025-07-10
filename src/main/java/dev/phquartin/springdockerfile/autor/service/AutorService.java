package dev.phquartin.springdockerfile.autor.service;

import dev.phquartin.springdockerfile.autor.model.Autor;
import dev.phquartin.springdockerfile.autor.repository.AutorRepository;
import dev.phquartin.springdockerfile.autor.validation.AutorValidation;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private final AutorRepository autorRepository;
    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public void save(Autor autor) {
        AutorValidation.validate(autor);
        autorRepository.save(autor);
    }

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Autor findById(Long id){
        return autorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Autor nao encontrado"));
    }
    public Autor findByNome(String nome){
        return autorRepository.findByNomeContains(nome);
    }

    public void deleteById(Long id) {
        findById(id);
        autorRepository.deleteById(id);
    }

}
