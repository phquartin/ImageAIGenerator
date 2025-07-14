package dev.phquartin.springdockerfile.local.autor.controller;

import dev.phquartin.springdockerfile.local.autor.model.Autor;
import dev.phquartin.springdockerfile.local.autor.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {

    private final AutorService autorService;
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Autor autor) {
        autorService.save(autor);
        return ResponseEntity.ok("Autor salvo com sucesso");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Autor>> findAll() {
        return ResponseEntity.ok(autorService.findAll());
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Autor> findById(@PathVariable Long id) {
        return ResponseEntity.ok(autorService.findById(id));
    }
    @GetMapping("/nome/{nome}")
    public ResponseEntity<Autor> findByNome(@PathVariable String nome) {
        return ResponseEntity.ok(autorService.findByNome(nome));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        autorService.deleteById(id);
        return ResponseEntity.ok("Autor deletado com sucesso");
    }

}
