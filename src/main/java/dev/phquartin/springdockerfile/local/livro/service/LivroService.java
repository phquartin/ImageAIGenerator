package dev.phquartin.springdockerfile.local.livro.service;

import dev.phquartin.springdockerfile.local.livro.model.Livro;
import dev.phquartin.springdockerfile.local.livro.repository.LivroRepository;
import dev.phquartin.springdockerfile.local.livro.validation.LivroValidation;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public void save(Livro livro) {
        LivroValidation.validate(livro);
        livroRepository.save(livro);
    }

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }
    public Livro findById(Long id){
        return livroRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Livro nao encontrado"));
    }
    public Livro findByTitulo(String titulo){
        return livroRepository.findByTituloContains(titulo);
    }
    public void deleteById(Long id) {
        findById(id);
        livroRepository.deleteById(id);
    }



}
