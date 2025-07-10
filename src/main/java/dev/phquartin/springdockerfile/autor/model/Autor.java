package dev.phquartin.springdockerfile.autor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.phquartin.springdockerfile.livro.model.Livro;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "nome")
    private String nome;

    @OneToMany(mappedBy = "autor")
    @JsonIgnoreProperties("autor")
    private List<Livro> livros;

}
