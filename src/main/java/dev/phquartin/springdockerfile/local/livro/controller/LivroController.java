package dev.phquartin.springdockerfile.local.livro.controller;

import dev.phquartin.springdockerfile.local.livro.model.Livro;
import dev.phquartin.springdockerfile.local.livro.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    private final LivroService livroService;
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping("/save")
    public void save(@RequestBody Livro livro) {
        livroService.save(livro);
    }

    @GetMapping("/all")
    public List<Livro> findAll() {
        return livroService.findAll();
    }
    @GetMapping("/id/{id}")
    public Livro findById(@PathVariable Long id) {
        return livroService.findById(id);
    }
    @GetMapping("/titulo/{titulo}")
    public Livro findByTitulo(@PathVariable String titulo) {
        return livroService.findByTitulo(titulo);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        livroService.deleteById(id);
    }

}
