package dev.phquartin.springdockerfile.local.livro.controller;

import dev.phquartin.springdockerfile.local.livro.model.Livro;
import dev.phquartin.springdockerfile.local.livro.service.LivroService;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> save(@RequestBody Livro livro) {
        livroService.save(livro);
        return ResponseEntity.ok("Livro salvo com sucesso");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Livro>> findAll() {
        return ResponseEntity.ok(livroService.findAll());
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Livro> findById(@PathVariable Long id) {
        return ResponseEntity.ok(livroService.findById(id));
    }
    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<Livro> findByTitulo(@PathVariable String titulo) {
        return ResponseEntity.ok(livroService.findByTitulo(titulo));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        livroService.deleteById(id);
        return ResponseEntity.ok("Livro deletado com sucesso");
    }

}
