package dev.phquartin.springdockerfile.autor.service;

import dev.phquartin.springdockerfile.autor.model.Autor;
import dev.phquartin.springdockerfile.autor.repository.AutorRepository;
import dev.phquartin.springdockerfile.autor.validation.AutorValidation;
import org.springframework.stereotype.Service;

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

}
