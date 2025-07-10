package dev.phquartin.springdockerfile.livro.repository;

import dev.phquartin.springdockerfile.livro.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
