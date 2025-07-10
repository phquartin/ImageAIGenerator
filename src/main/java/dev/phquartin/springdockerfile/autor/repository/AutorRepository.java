package dev.phquartin.springdockerfile.autor.repository;

import dev.phquartin.springdockerfile.autor.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor findByNomeContains(String nome);
}
